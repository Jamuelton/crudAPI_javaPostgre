package com.jamu.app.rest.Controller;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jamu.app.rest.Models.Diciplina;
import com.jamu.app.rest.Repository.DiciplinaRepository;


@RestController
public class ApiControllers {

    
    private DiciplinaRepository diciplinaRepo;


    @GetMapping(value = "/diciplinas")
    public List<Diciplina> getDiciplinas(){
        return diciplinaRepo.findAll();
    }

   
}
