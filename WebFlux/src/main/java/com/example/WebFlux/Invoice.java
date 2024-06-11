package com.example.WebFlux;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document
public class Invoice {

    @Id
    private Integer id;
    private String name;
    private String number;
    private Double amount;
}