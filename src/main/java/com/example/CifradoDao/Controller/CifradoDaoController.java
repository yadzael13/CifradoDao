package com.example.CifradoDao.Controller;
//Entities y logica
import com.example.CifradoDao.Logic.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CifradoDao.Entities.*;


import lombok.var;


// Indicamos que nuestra clase va ser tipo controlador
@RestController
@RequestMapping("/Totalplay")
public class CifradoDaoController {
    @Autowired CifradoDaoLogic cifradoDaoLogic;
    
    @GetMapping("helloWolrd")
    public Response helloWolrd(Request input){
        var resp = cifradoDaoLogic.helloWorld(input);
        return resp;
    }
}
