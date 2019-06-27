package com.yuxiu.edu.service.base;

import com.yuxiu.edu.mapper.UserMapper;

public  interface IBaseService<T> {


    public T findById(Integer id);

    public T findByUUID(Integer uuid);

    public void deleteById(Integer id);

    public void deleteByUUID(Integer uuid);

    public void insert(T t);

    public void update(T t);

}
