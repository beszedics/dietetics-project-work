package com.project.dietetics.database.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "height")
    private Double height;

    @Column(name = "age")
    private Integer age;

    @Column(name = "sex")
    private Boolean sex;

    @Column(name = "activity")
    private Integer activity;

    @Column(name = "diabetes_type")
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

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }

    public Integer getDiabetesType() {
        return diabetesType;
    }

    public void setDiabetesType(Integer diabetesType) {
        this.diabetesType = diabetesType;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                ", sex=" + sex +
                ", activity=" + activity +
                ", diabetesType=" + diabetesType +
                '}';
    }
}
