package com.example.CifradoDao.Entities;

public class Response {
    private String accountNo;
    private String result;
    private String resultDescription;

    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public String getResultDescription() {
        return resultDescription;
    }
    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }
}
