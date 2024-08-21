package com.trainingdev.td_bs_management.controller;

import com.trainingdev.td_bs_management.dto.UserDetail;
import com.trainingdev.td_bs_management.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
public class userController {

    @PostMapping("/user")
    public UserDetail createUser(@RequestBody UserRequest userRequest){
        return new UserDetail();
    }

    @PutMapping("/user")
    public UserDetail updateUser(@RequestBody UserRequest userRequest){
        return new UserDetail();
    }

    @GetMapping("/user/{id}")
    public UserDetail getUser(@PathVariable Integer id){
        return new UserDetail();
    }


}
