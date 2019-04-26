package com.demo.api;

import java.text.SimpleDateFormat;
import java.util.UUID;

/**
 * @Auther: 叫兽阿郎
 * @Date: 2019/4/26 09:26
 * @Email： elizhiyong@163.com
 * @link: http://blog.dwzurl.cn/
 * 工具类
 **/
public class Tool {

    /**
     *
     * 生成uuid
     * @return
     */
    public static String randomUUID() {
        return UUID.randomUUID().toString().replace("-", "")+getNumTime();
    }

    /**
     * yyyyMMddHHmmss
     * @return
     */
    public static String getNumTime(){
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
    }

}
