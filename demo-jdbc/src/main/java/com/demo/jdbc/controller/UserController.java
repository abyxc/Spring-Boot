package com.demo.jdbc.controller;

import com.demo.api.CtrlResult;
import com.demo.api.Tool;
import com.demo.jdbc.model.User;
import com.demo.jdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 叫兽阿郎
 * @Date: 2019/4/25 17:10
 * @Email： elizhiyong@163.com
 * @link: http://blog.dwzurl.cn/
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    /**
     * 新增用户
     * @param user
     * @return
     */
    @RequestMapping("/add")
    public CtrlResult add(User user){
        CtrlResult ctrlResult = new CtrlResult();
        try {
            user.setId(Tool.randomUUID());
            user.setCreateTime(System.currentTimeMillis());
            user.setUpdataTime(System.currentTimeMillis());
            if(userService.add(user) > 0){
                ctrlResult.setState(true);
                ctrlResult.setMsg("新增成功");
            }else {
                ctrlResult.setState(false);
                ctrlResult.setMsg("新增失败");
            }
        }catch (Exception e){
            ctrlResult.setState(false);
            ctrlResult.setMsg("新增失败");
            e.printStackTrace();
        }
        return ctrlResult;
    }
}
