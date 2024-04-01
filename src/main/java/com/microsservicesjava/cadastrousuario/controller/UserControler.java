package com.microsservicesjava.cadastrousuario.controller;

import com.microsservicesjava.cadastrousuario.dto.UserDto;
import com.microsservicesjava.cadastrousuario.entity.User;
import com.microsservicesjava.cadastrousuario.mapper.UserMapper;
import com.microsservicesjava.cadastrousuario.service.UserService;
import feign.Response;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserControler {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> save(@RequestBody UserDto userDto) {
        UserDto user = userService.save(userDto);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long id) {
        UserDto user = userService.findById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> users = userService.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto) {
        UserDto user = userService.update(userDto);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        userService.delete(id);
        return new ResponseEntity<>("User deleted successfully!", HttpStatus.OK);
    }
}
