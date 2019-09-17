package com.demo.groovy;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import org.apache.commons.codec.digest.DigestUtils;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 叫兽阿郎
 * @Date: 2019/9/16 16:18
 * @Email： elizhiyong@163.com
 * @link: http://blog.dwzurl.cn/
 **/
public class JavaToGroovyUtil {

    private static Map<String, Class<?>> GROOVYCLASSCACHE = new HashMap<>();
    /**
     *执行groovy中方法
     *
     * @param path  脚本路径
     * @param scriptName    脚本中方法名称
     * @param args  入参
     * @return
     * @throws IOException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static Object runGroovyScript(String path,String scriptName,Object... args) throws IOException, IllegalAccessException, InstantiationException {
        GroovyClassLoader loader= new GroovyClassLoader();
        File file = new File(path);
        String key = DigestUtils.md5Hex(new FileInputStream(file));
        Class groovyClass;
        if(GROOVYCLASSCACHE.containsKey(key)){
            groovyClass = GROOVYCLASSCACHE.get(key);
        }else {
            groovyClass =loader.parseClass(file);
            GROOVYCLASSCACHE.put(key,groovyClass);
        }
        Object cl = groovyClass.newInstance();
//        SpringContextUtils.autowireBean，可以实现自动注入bean， 就可以在groovy中调用java代码
        SpringContextUtils.autowireBean(cl);
        GroovyObject object =(GroovyObject) cl;
        return object.invokeMethod(scriptName, args);
    }


}
