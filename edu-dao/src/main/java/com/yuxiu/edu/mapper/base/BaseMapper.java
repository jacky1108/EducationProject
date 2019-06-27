package com.yuxiu.edu.mapper.base;

import com.yuxiu.edu.model.User;

public interface BaseMapper<T> {

    public T findById(Integer id);

    public T findByUUID(Integer uuid);

    public void deleteById(Integer id);

    public void deleteByUUID(Integer uuid);

    public void insert(T t);

    public void update(T t);
}
