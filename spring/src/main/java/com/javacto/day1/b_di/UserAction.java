package com.javacto.day1.b_di;

/**
 * liu
 **/
public class UserAction {
    //dao需要依赖  业务层
    //之前没有学spring时候 需要在这里new对象    这种偶合很高
    //private  UserServcie userServcie = new UserServcieImpl();
    //学完sring之后就得到了解偶   生成setter方法
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        userService.addUser();
    }
}
