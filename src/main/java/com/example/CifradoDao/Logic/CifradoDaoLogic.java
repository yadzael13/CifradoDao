package com.example.CifradoDao.Logic;
import org.springframework.stereotype.Service;

import com.example.CifradoDao.Entities.*;

@Service
public class CifradoDaoLogic {
    public Response helloWorld(Request input){
        Response resp = new Response();
        resp.setAccountNo("Hello World from logic!!");
        resp.setResult("Encrypted correct");
        resp.setResultDescription("Succesfully");
        return resp;
    }
}
