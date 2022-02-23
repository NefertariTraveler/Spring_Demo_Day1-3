package com.javacto.day2.e_myAnno;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * liu
 **/
@Service("userServiceImpl3")
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("使用自己的");
    }
}
