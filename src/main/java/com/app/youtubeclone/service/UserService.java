package com.app.youtubeclone.service;

import com.app.youtubeclone.entity.Users;
import com.app.youtubeclone.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@Service
public interface UserService
{
    public String register(String name, String email, String password);
}