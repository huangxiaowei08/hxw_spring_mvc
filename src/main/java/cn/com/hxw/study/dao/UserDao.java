package cn.com.hxw.study.dao;

import cn.com.hxw.study.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by huangxiaowei on 17/9/9.
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User>  getUser(){
        String sql = "select id,name,age from user";
        List rows= jdbcTemplate.queryForList(sql);
        List<User> userList = new ArrayList<User>();
        for (int i = 0; i < rows.size(); i++) {
            Map userMap = (Map) rows.get(i);
            User user = new User();
            user.setId(Integer.parseInt(userMap.get("id").toString()));
            user.setName(userMap.get("name").toString());
            user.setAge(Integer.parseInt(userMap.get("age").toString()));
            userList.add(user);
        }
        System.out.println(userList.toString());
        return userList;
    }
}
