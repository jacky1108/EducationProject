package com.yuxiu.edu.mapper;

import com.yuxiu.edu.mapper.base.BaseMapper;
import com.yuxiu.edu.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    public User findById(Integer id);


    public void deleteById(Integer id);

    public void insert(User user);

    public void update(User user);

}



