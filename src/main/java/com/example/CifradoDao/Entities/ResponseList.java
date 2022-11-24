package com.example.CifradoDao.Entities;

import java.util.List;
public class ResponseList {

    private List<String> outputList;
    private String result;
    private String resultDescription;


    public List<String> getOutputList() {
        return outputList;
    }
    public void setOutputList(List<String> outputList) {
        this.outputList = outputList;
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
