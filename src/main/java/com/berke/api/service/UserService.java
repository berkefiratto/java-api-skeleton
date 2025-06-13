package com.berke.api.service;

import com.berke.api.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
    UserDto createUser(UserDto userDto);
}
