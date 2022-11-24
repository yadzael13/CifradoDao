package com.example.CifradoDao.Entities;

public class Request {
    private String accountNo;
    private String privatekey;
    private String publicKey;


    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
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
