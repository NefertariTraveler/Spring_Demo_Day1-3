package com.javacto.day1.b_di;

/**
 * liu
 **/
public class UserServiceImpl implements UserService {
    //业务层需要依赖  dao
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
        System.out.println("a_ioc");
    }
}
