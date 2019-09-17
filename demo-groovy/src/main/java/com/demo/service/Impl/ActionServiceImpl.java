package com.demo.service.Impl;

import com.demo.service.ActionService;
import org.springframework.stereotype.Service;

/**
 * @Auther: 叫兽阿郎
 * @Date: 2019/9/17 10:25
 * @Email： elizhiyong@163.com
 * @link: http://blog.dwzurl.cn/
 **/
@Service
public class ActionServiceImpl implements ActionService {


    //执行数据查询操作
    @Override
    public String getData() {
        //模拟是从数据库查询出来的数据
        /**
         * ........................
         */
        return "叫兽阿郎";
    }
}
