package com.demo.groovy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: 叫兽阿郎
 * @Date: 2019/9/17 10:46
 * @Email： elizhiyong@163.com
 * @link: http://blog.dwzurl.cn/
 *
 * 获取上下文，供groovy使用
 **/
@Configuration
public class SpringContextUtils implements ApplicationContextAware {
    static ApplicationContext context;


    @Override
    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        SpringContextUtils.context = context;
    }

    public static ApplicationContext getContext() {
        return context;
    }

    public static void autowireBean(Object bean) {
        context.getAutowireCapableBeanFactory().autowireBean(bean);
    }

    public static <T> T getBean(Class<T> clazz) {
        return context.getBean(clazz);
    }
}
