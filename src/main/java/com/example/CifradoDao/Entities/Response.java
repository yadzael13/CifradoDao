package com.example.CifradoDao.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Response {
    private String accountNo;
    private String result;
    private String resultDescription;
}
