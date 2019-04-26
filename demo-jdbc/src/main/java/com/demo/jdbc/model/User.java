package com.demo.jdbc.model;

/**
 * @Auther: 叫兽阿郎
 * @Date: 2019/4/25 16:52
 * @Email： elizhiyong@163.com
 * @link: http://blog.dwzurl.cn/
 **/
public class User {

    private String id;
//    年龄
    private Integer age;
    //姓名
    private String name;
//    电话
    private String phone;
//    地址
    private String address;
//    密码
    private String passWord;
//    创建时间
    private Long createTime;
//    更新时间
    private Long updataTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(Long updataTime) {
        this.updataTime = updataTime;
    }
}
