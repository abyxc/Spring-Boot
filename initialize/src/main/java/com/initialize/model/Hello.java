package com.initialize.model;

/**
 * @Auther: 叫兽阿郎
 * @Date: 2019/4/15 10:40
 * @Email： elizhiyong@163.com
 * @like: http://blog.dwzurl.cn/
 **/
public class Hello {
    //姓名
    private String name;
    //联系方式
    private String phone;
    //年龄
    private Integer age;
    //地址
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
