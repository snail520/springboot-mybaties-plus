package com.snail.springbootmp.controller;

import com.snail.springbootmp.entity.UserDemo;
import com.snail.springbootmp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaoxiang on 18/10/8.
 */

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/insert")
    public boolean insert(String loginName,String age){
        UserDemo userDemo = new UserDemo();
        userDemo.setLoginName(loginName);
        userDemo.setAge(Integer.parseInt(age));
        boolean save = userService.save(userDemo);
        log.info("save: " + save);
        return save;
    }
}
