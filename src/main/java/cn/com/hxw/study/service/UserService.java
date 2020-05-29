package cn.com.hxw.study.service;

import cn.com.hxw.study.dao.UserDao;
import cn.com.hxw.study.entity.User;
import cn.com.hxw.study.my.annotation.SystemServiceLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by huangxiaowei on 17/9/9.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    //此处为AOP拦截Service记录异常信息。方法不需要加try-catch
    @SystemServiceLog(description = "查询用户")
    public List<User> getUser(){
        return userDao.getUser();
    }

}
