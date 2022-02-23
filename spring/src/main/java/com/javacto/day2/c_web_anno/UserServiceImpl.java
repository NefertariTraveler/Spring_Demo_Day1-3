package com.javacto.day2.c_web_anno;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * liu
 **/
@Service("userServiceImpl2")
public class UserServiceImpl implements UserService {
    //业务层需要依赖  dao
    @Resource
    private UserDao userDao;

    @Override
    public void addUser() {
        userDao.addUser();
    }
}
