package com.jamu.app.rest.Controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


import com.jamu.app.rest.Repository.DiciplinaRepository;


@RestController
public class ApiControllers {

    @Autowired
    private DiciplinaRepository diciplinaRepo;


    @GetMapping(value = "/diciplinas")
    public List<User> getDiciplinas(){
        return diciplinaRepo.findAll();
    }

   
}
