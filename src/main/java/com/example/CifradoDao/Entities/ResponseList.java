package com.example.CifradoDao.Entities;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseList {
    private List<String> outputList;
	private String result;
	private String resultDescription;
}
