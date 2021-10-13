package com.example.lksun.provider.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Goods implements Serializable {
    private Integer id;

    private String name;

    private Integer price;

    private Integer total;

    private static final long serialVersionUID = 1L;
}