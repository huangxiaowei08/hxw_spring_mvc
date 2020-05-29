package cn.com.hxw.study.controller;

import cn.com.hxw.study.entity.User;
import cn.com.hxw.study.my.annotation.SystemControllerLog;
import cn.com.hxw.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * Created by huangxiaowei on 17/9/9.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userList",method = RequestMethod.GET)
    //此处为记录AOP拦截Controller记录用户操作
    @SystemControllerLog(description = "删除用户")
    public String getUser(Map<String,Object> map){
        List<User> userList = userService.getUser();
        System.out.println(userList.toString());
        map.put("userList",userList);
        return "/views/list";
    }


}
