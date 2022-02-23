package com.javacto.day2.b_anno;

import org.springframework.stereotype.Service;

/**
 * describe
 * @Component("userServiceImpl")  取代了  <bean id="" class=""></bean>
 * Component    取代了  <bean  class=""></bean> 如果没有值，默认系统给一个id就是类名 首字母小写
 *
 * 对web层衍生了三个注解
 * Controller 控制层
 * @Service 业务层
 * Repository  dao层
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("使用注解");
    }
}
