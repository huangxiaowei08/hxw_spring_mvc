package cn.com.hxw.study.service;

import cn.com.hxw.study.dao.UserDao;
import cn.com.hxw.study.entity.User;
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

    public List<User> getUser(){
        return userDao.getUser();
    }

}
