package com.qf.pojo;

public class Pet {
    private Integer id;  //分类ID
    private String petType; //类别

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }
}
