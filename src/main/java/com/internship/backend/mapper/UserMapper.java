package com.internship.backend.mapper;

import com.internship.backend.entity.DUser;

public interface UserMapper {
    int insert(DUser DUser);

    DUser select(int id);

    DUser login(String username);

}
