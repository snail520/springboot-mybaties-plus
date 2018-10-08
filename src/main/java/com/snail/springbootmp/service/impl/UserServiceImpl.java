package com.snail.springbootmp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.snail.springbootmp.entity.UserDemo;
import com.snail.springbootmp.mapper.UserMapper;
import com.snail.springbootmp.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by gaoxiang on 18/10/8.
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,UserDemo> implements UserService {

}
