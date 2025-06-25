package com.pan;

import com.pan.pojo.UserPojo;
import com.pan.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ImauSpringbootDemoApplicationTests {

    @Autowired
    Hello hello;

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
//        userService.addUser("丁真和他的动物朋友");
//        userService.addUser("丁甲和他的动物朋友");
//        userService.addUser("丁乙和他的动物朋友");
//        userService.delUser(127);
        userService.delUserByName("丁真和他的动物朋友");
    }

    @Test
    void test() {
//        userService.findUerByName(126);
//        userService.findUserByPassword("丁");
        userService.updateUserByUsername(124, "789");


    }

}
