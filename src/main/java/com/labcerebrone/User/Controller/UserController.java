package com.labcerebrone.User.Controller;


import com.labcerebrone.User.Model.User;
import com.labcerebrone.User.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chaos")
public class UserController {

    @Autowired
    private UserService userService;



    @PostMapping("/")
    public User saveUserId(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id") Long userId){

        return userService.findUserById(userId);
    }

    @GetMapping("/all")
    public List<User> getAllUser(){
        return userService.getAll();
    }


}
