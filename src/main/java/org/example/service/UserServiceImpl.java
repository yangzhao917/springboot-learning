package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    public void doAdd(){
        System.out.println("doAdd >>>> " + System.currentTimeMillis());
    }
}
