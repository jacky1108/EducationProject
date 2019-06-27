package com.yuxiu.edu.service;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.base.IBaseService;

public interface IUserService extends IBaseService<User> {

    public User login(String username,String password);
}
