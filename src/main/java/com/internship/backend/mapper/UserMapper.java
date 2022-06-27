package com.internship.backend.mapper;

import com.internship.backend.entity.user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insert(user user);

}
