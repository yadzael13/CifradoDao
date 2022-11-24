package com.example.CifradoDao.Controller;
//Entities y logica
import com.example.CifradoDao.Logic.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CifradoDao.Entities.*;


import lombok.var;


// Indicamos que nuestra clase va ser tipo controlador
@RestController
@RequestMapping("/Totalplay")
public class CifradoDaoController {
    @Autowired CifradoDaoLogic cifradoDaoLogic;
    
    @PostMapping("DescryptAccount")
    public Response DescryptAccount(@RequestBody Request input) throws Exception{
        var resp = cifradoDaoLogic.InputService(input);
        return resp;
    }

    @PostMapping("EncripList")
    public ResponseList EncripList(RequestList input) throws Exception{
        var resp = cifradoDaoLogic.EncripList(input);
        return resp;
    }

    @PostMapping("DecripList")
    public ResponseList DecripList(RequestList input) throws Exception{
        var resp = cifradoDaoLogic.DecripList(input);
        return resp;
    }
    
}
