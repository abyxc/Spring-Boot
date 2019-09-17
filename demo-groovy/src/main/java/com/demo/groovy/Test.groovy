package com.demo.groovy


import com.demo.service.ActionService
import org.springframework.beans.factory.annotation.Autowired

/**
 * groovy 脚本
 */
class Test {


    @Autowired
    ActionService actionService


    int getNum(param1,param2){
        return param1 * param2
    }


    /**
     * 获取map中key对应的value
     * @param map
     * @return
     */
    def getMapKey(map){
        return 'hi:' + map['name']
    }


    /**
     * 调取java代码
     * @param age
     * @return
     */
    def getJavaCode1(int age){
        Step step = new Step()
        return step.getAge(age)
    }

//    获取用户名
    def getName(){
        return actionService.getData()
    }
}
