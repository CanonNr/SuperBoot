package com.example.lksun.provider.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class User implements Serializable {
    private Integer id;

    private String name;

    private Integer age;

    private Integer money;

    private static final long serialVersionUID = 1L;
}