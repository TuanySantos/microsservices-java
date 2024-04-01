package com.microsservicesjava.cadastrousuario.service;

import com.microsservicesjava.cadastrousuario.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto save(UserDto userDto);
    List<UserDto> findAll();
    UserDto findById(Long id);
    void delete(Long id);
    UserDto update(UserDto userDto);
}
