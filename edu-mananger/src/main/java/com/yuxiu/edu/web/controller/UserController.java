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


    @RequestMapping("find")
    public String find(Integer id) {
        System.out.println(".....");
        User user = userService.findById(id);
        System.out.println(user);
        return null;
    }


}
