package com.emersoncristal.medications.service;

import java.util.List;

import com.emersoncristal.medications.dto.UserDto;
import com.emersoncristal.medications.model.User;
// interface for Spring Security authentication and UserDto utility
public interface UserServiceI {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
