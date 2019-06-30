package com.yuxiu.edu.web.controller;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.IUserService;
import com.yuxiu.edu.web.controller.Base.BaseContorller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController extends BaseContorller<User> {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(){

        return "Default";
    }

    @RequestMapping("find")
    public String find(Integer id) {

        User user = userService.findById(id);
        System.out.println(user);
        return null;
    }

    @RequestMapping(MANAGE)
    public String manage()
    {
        return MANAGE_PAGE;
    }

    @RequestMapping(INFO)
    public String info(){

        return INFO_PAGE;
    }

    @RequestMapping(EDIT)
    public String edit()
    {

        return EDIT_PAGE;
    }

}
