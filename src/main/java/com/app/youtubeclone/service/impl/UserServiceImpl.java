package com.app.youtubeclone.service.impl;

import com.app.youtubeclone.entity.Users;
import com.app.youtubeclone.repository.UsersRepo;
import com.app.youtubeclone.service.MyUserDetailService;
import com.app.youtubeclone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.KeyStore;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepo usersRepo;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public String register(String name, String email, String password) {
       /* try{
            Users users = new Users(name,email,bCryptPasswordEncoder.encode(password));
            MyUserDetailService myUserDetailService = null;
            myUserDetailService.save(users);
            System.out.println(users.getEmail());
            return "home";
        }catch (Exception e){
            return "home";
        }  */

        try {
            Users users = new Users(name,email,bCryptPasswordEncoder.encode(password));
            users.setRole("user");
            users.setStatus("false");
            usersRepo.save(users);
        }
        catch (Exception e){
            System.out.println(e);
            return "negative";
        }
        return "home";
    }


}
