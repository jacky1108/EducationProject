package com.yuxiu.edu.web.controller;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(){
        System.out.println("登陆.....");
        return "Default";
    }

    @RequestMapping("find")
    public String find(Integer id) {
        System.out.println("查找user.....");
        User user = userService.findById(id);
        System.out.println(user);
        return null;
    }

    @RequestMapping("manage")
    public String manage(){
        System.out.println("用户管理.....");
        return "User/UserManage";
    }

    @RequestMapping("info")
    public String info(){
        System.out.println("用户信息.....");
        return "User/UserInfo";
    }

    @RequestMapping("edit")
    public String edit()
    {
        return "User/UserEdit";
    }

}
