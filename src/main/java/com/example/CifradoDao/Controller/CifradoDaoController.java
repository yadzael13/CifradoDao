package com.example.CifradoDao.Controller;

//Logica
import com.example.CifradoDao.Logic.CifradoDaoLogic;

//Request
import com.example.CifradoDao.Entities.RequestList;

//Librerias básicas
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;



import lombok.*;

@RestController
@RequestMapping("/v1")
public class CifradoDaoController {

    @Autowired
    CifradoDaoLogic cifradoDaoLogic;
    @PostMapping("/EncripList")
    public ResponseEntity <?> DescryptAccount(
            @RequestBody RequestList input
    ) throws Exception {

        var result = cifradoDaoLogic.EncripList(input);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);


    }
}
