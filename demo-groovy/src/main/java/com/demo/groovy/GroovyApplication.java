package com.demo.groovy;

import com.demo.service.ActionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: 叫兽阿郎
 * @Date: 2019/9/16 16:38
 * @Email： elizhiyong@163.com
 * @link: http://blog.dwzurl.cn/
 **/
public class GroovyApplication {


    private static Logger logger = LoggerFactory.getLogger(GroovyApplication.class);





    public static void main(String[] args) {
        try {
            //groovy文件路径
            String path = "E:\\JetBrains\\demo\\demo-groovy\\src\\main\\java\\com\\demo\\groovy\\Test.groovy";
            Object obj = JavaToGroovyUtil.runGroovyScript(path, "getJavaCode1", new Object[]{6});
            logger.info("groovy返回:"+obj);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
