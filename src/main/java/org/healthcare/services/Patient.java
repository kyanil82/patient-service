/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.healthcare.services;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author anilkumaryadav
 */
public class Patient {
    
    private Long id;
    
    @NotBlank
    private String name;
    @Min(1)
    @Max(100)
    private int age;
    
     
    // ... GETTERS AND SETTERS

    Patient(long l, String name, int age) {
        this.id = l;
        this.name = name;
        this.age = age;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Patient [id=" + id +  ", name=" + name + ", age=" + age + "]";
    }
    
}
