package com.example.lksun.provider.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Order implements Serializable {
    private Integer id;

    private Integer goodId;

    private Integer userId;

    private static final long serialVersionUID = 1L;
}