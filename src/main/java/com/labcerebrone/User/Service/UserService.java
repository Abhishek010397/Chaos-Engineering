package com.labcerebrone.User.Service;


import com.labcerebrone.User.Model.User;
import com.labcerebrone.User.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public User findUserById(Long userId){
        User user = null;
        try {
            user = userRepository.findByUserId(userId);
        }
        catch (Exception e){
            System.out.println("STackTrace: " + Arrays.toString(e.getStackTrace()));
            System.out.println("Caught an Exception....");
            user = null;
        }
        return user;
    }

    public List<User> getAll(){
        List<User> users = null;
        try {
            users = userRepository.findAll();
        }
        catch (Exception e){
            System.out.println("STackTrace: " + Arrays.toString(e.getStackTrace()));
            System.out.println("Caught an Exception....");
            users = new ArrayList<>();
        }
        return users;
    }
}
