package com.project.kuhniia.service;

import com.project.kuhniia.dto.UserDto;
import com.project.kuhniia.entity.User;

public interface UserService {

    User findByEmail(String email);

    void register(UserDto userDto);
}
