package com.microsservicesjava.cadastrousuario.mapper;

import com.microsservicesjava.cadastrousuario.dto.UserDto;
import com.microsservicesjava.cadastrousuario.entity.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserMapper {
    public static UserDto toUserDto(User user) {
        return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
    }

    public static User toUser(UserDto userDto) {
        return new User(userDto.getId(), userDto.getFirstName(), userDto.getLastName(), userDto.getEmail(), userDto.getPassword());
    }

    public static List<UserDto> toListUserDto(List<User> userList) {
        return userList.stream().map(UserMapper::toUserDto).collect(Collectors.toList());
    }
}
