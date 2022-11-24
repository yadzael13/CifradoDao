package com.example.CifradoDao.Entities;

import java.util.List;


public class RequestList {
    private List<String> inputList;
    private String privatekey;
    private String publicKey;


    public List<String> getInputList() {
        return inputList;
    }
    public void setInputList(List<String> inputList) {
        this.inputList = inputList;
    }

    public String getPrivatekey() {
        return privatekey;
    }
    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey;
    }
    public String getPublicKey() {
        return publicKey;
    }
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
