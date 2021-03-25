package com.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private Integer id;
    private String name;
    private Integer age;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.age = 12;
    }
}
