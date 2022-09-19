package com.jamu.app.rest.Controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping(value = "/save")
    public String saveDiciplina(@RequestBody Diciplina diciplina){
        diciplinaRepo.save(diciplina);
        return "salvo!";
    }
   
    @PutMapping(value = "update/{id}")
    public String updateDiciplina(@PathVariable long id, @RequestBody Diciplina diciplina){
        Diciplina updateDiciplina = diciplinaRepo.findById(id).get();
        updateDiciplina.setNome(diciplina.getNome());
        updateDiciplina.setCodigo(diciplina.getCodigo());
        updateDiciplina.setCarga(diciplina.getCarga());
        diciplinaRepo.save(updateDiciplina);
        return "Atualizado!";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteDiciplina(@PathVariable long id){
        Diciplina deleteDiciplina = diciplinaRepo.findById(id).get();
        diciplinaRepo.delete(deleteDiciplina);
        return id + "deletado";
    }
}
