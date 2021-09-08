package com.project.dietetics.services.models;

public class UserModel {

    private Integer id;
    private String name;
    private Double weight;
    private Double height;
    private Integer age;
    private String sex;
    private String activity;
    private Integer diabetesType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Integer getDiabetesType() {
        return diabetesType;
    }

    public void setDiabetesType(Integer diabetesType) {
        this.diabetesType = diabetesType;
    }
}
