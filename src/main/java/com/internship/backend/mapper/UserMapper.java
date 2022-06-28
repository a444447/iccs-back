package com.internship.backend.mapper;

import com.internship.backend.entity.DUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insert(DUser DUser);

}
