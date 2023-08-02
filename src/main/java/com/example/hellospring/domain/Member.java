package com.example.hellospring.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Member {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 알아서 생성해주면 strategy IDENTITY
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
