package com.demo.jdbc.service.impl;

import com.demo.jdbc.dao.UserDao;
import com.demo.jdbc.model.User;
import com.demo.jdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: 叫兽阿郎
 * @Date: 2019/4/25 17:09
 * @Email： elizhiyong@163.com
 * @link: http://blog.dwzurl.cn/
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public int add(User user) {
        return userDao.add(user);
    }
}
