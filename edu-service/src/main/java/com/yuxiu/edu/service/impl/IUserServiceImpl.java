package com.yuxiu.edu.service.impl;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.IUserService;
import com.yuxiu.edu.service.base.IBaseService;
import com.yuxiu.edu.service.base.IBaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IUserServiceImpl extends IBaseServiceImpl<User> implements IUserService {


    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User findByUUID(Integer uuid) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUID(Integer uuid) {

    }

    @Override
    public void insert(User user) {

    }

    @Override
    public void update(User user) {

    }
}
