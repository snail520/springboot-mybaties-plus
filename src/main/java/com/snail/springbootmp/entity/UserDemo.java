package com.snail.springbootmp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Created by gaoxiang on 18/9/27.
 */


public class UserDemo extends SuperEntity<UserDemo> {
    @TableField(value = "loginName")
    private String loginName;
    private int age;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
