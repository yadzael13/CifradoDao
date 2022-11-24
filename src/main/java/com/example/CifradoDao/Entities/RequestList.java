package com.example.CifradoDao.Entities;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestList {
    private List<String> inputList;
	private String privatekey;
	private String publicKey;
}
