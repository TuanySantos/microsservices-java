package com.microsservicesjava.cadastrousuario.service.impl;

import com.microsservicesjava.cadastrousuario.dto.UserDto;
import com.microsservicesjava.cadastrousuario.entity.User;
import com.microsservicesjava.cadastrousuario.exception.ResourceNotFoundException;
import com.microsservicesjava.cadastrousuario.mapper.UserMapper;
import com.microsservicesjava.cadastrousuario.repository.UserRepository;
import com.microsservicesjava.cadastrousuario.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto save(UserDto userDto) {
        User user = userMapper.toUser(userDto);
        userRepository.save(user);
        return userMapper.toUserDto(user);
    }

    @Override
    public List<UserDto> findAll() {
        List<User> userList = userRepository.findAll();
        return userMapper.toListUserDto(userList);
    }

    @Override
    public UserDto findById(Long id) {
       User user =  userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found: " + id));
        return userMapper.toUserDto(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDto update(UserDto userDto) {
        User user = userRepository.findById(userDto.getId()).orElseThrow(() -> new ResourceNotFoundException("User not found: " + userDto.getId()));
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);

        return userMapper.toUserDto(user);
    }
}
