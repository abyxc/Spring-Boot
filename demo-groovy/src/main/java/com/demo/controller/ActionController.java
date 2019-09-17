package com.demo.controller;

import com.demo.groovy.GroovyApplication;
import com.demo.groovy.JavaToGroovyUtil;
import com.demo.service.ActionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 叫兽阿郎
 * @Date: 2019/9/17 10:17
 * @Email： elizhiyong@163.com
 * @link: http://blog.dwzurl.cn/
 **/
@RestController
public class ActionController {

    private static Logger logger = LoggerFactory.getLogger(ActionController.class);

    @Autowired
    ActionService actionService;


    /**
     * 模拟用户发起请求，调用groovy脚本，然后脚本在回调java代码getData，并返回数据
     * @return
     */
    @RequestMapping("/getName")
    public Object getName(){
        Object obj = null;
        try {
            String path = "E:\\JetBrains\\demo\\demo-groovy\\src\\main\\java\\com\\demo\\groovy\\Test.groovy";
            obj = JavaToGroovyUtil.runGroovyScript(path, "getName", null);
            logger.info("groovy返回:{}",obj);
        }catch (Exception e){
           logger.error(e.getMessage(),e);
        }
        return obj;
    }
}
