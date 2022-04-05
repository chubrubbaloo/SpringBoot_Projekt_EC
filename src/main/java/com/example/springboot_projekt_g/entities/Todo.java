package com.example.springboot_projekt_g.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @NotBlank
    private String title;

    @Column
    @NotBlank
    private String message;


    public Todo(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public Todo() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

}