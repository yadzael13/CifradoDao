package com.example.CifradoDao.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Request {
    private String accountNo;
    private String privatekey;
	private String publicKey;
}
