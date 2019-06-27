package com.yuxiu.edu.service.base;

import com.yuxiu.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract  class IBaseServiceImpl<T> implements IBaseService<T> {

    //统一管理dao
    @Autowired
    protected UserMapper userMapper;


}
