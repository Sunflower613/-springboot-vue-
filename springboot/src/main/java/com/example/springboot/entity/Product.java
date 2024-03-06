package com.example.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class Product {
    private int id;
    private String productId;
    private String productName;
    private double price;
    private String imageSrc;
    private String status;
    private String typeId;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private LocalDate pubtime;
    private String subtitle;
    private int userId;
    private String branch;

}
