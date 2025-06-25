package com.pan.controller;

import com.pan.pojo.UserPojo;
import com.pan.service.UserService;
import com.pan.utils.Resuit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public String updateUser(@RequestParam("username") int username, @RequestParam("password") String password) {
        userService.updateUserByUsername(username, password);
        return Resuit.okGetString("修改成功");
    }

    @RequestMapping(value = "/deletUser", method = RequestMethod.DELETE)
    public String deletUser(@RequestParam("username") int username) {
        userService.delUser(username);
        return Resuit.okGetString("删除成功");
    }

    @RequestMapping(value = "/findUser", method = RequestMethod.GET)
    public String findUser(@RequestParam("password") String password) {
        Object userByPassword = userService.findUserByPassword(password);
        return Resuit.okGetStringByData("查询成功", userByPassword);
    }


}
