package com.project.dietetics.database.entities;

import javax.persistence.*;

@Entity
@Table(name = "foods")
public class Food {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "protein")
    private Double protein;

    @Column(name = "carbohydrate")
    private Double carbohydrate;

    @Column(name = "fat")
    private Double fat;

    @Column(name = "energy")
    private Double energy;

    @Column(name = "fiber")
    private Double fiber;

    @Column(name = "zinc")
    private Double zinc;

    @Column(name = "magnesium")
    private Double magnesium;

    @Column(name = "manganese")
    private Double manganese;

    @Column(name = "cholesterol")
    private Double cholesterol;

    @Column(name = "selenium")
    private Double selenium;

    @Column(name = "vitaminD")
    private Double vitaminD;

    @Column(name = "vitaminC")
    private Double vitaminC;

    @Column(name = "vitaminE")
    private Double vitaminE;

    @Column(name = "vitaminB12")
    private Double vitaminB12;

    @Column(name = "glycemic_index")
    private Integer glycemicIndex;

    @Column(name = "histamine_symptom_severity")
    private Integer histamineSymptomSeverity;

    @Column(name = "histamine_level")
    private Integer histamineLevel;

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

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(Double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getEnergy() {
        return energy;
    }

    public void setEnergy(Double energy) {
        this.energy = energy;
    }

    public Double getFiber() {
        return fiber;
    }

    public void setFiber(Double fiber) {
        this.fiber = fiber;
    }

    public Double getZinc() {
        return zinc;
    }

    public void setZinc(Double zinc) {
        this.zinc = zinc;
    }

    public Double getMagnesium() {
        return magnesium;
    }

    public void setMagnesium(Double magnesium) {
        this.magnesium = magnesium;
    }

    public Double getManganese() {
        return manganese;
    }

    public void setManganese(Double manganese) {
        this.manganese = manganese;
    }

    public Double getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(Double cholesterol) {
        this.cholesterol = cholesterol;
    }

    public Double getSelenium() {
        return selenium;
    }

    public void setSelenium(Double selenium) {
        this.selenium = selenium;
    }

    public Double getVitaminD() {
        return vitaminD;
    }

    public void setVitaminD(Double vitaminD) {
        this.vitaminD = vitaminD;
    }

    public Double getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(Double vitaminC) {
        this.vitaminC = vitaminC;
    }

    public Double getVitaminE() {
        return vitaminE;
    }

    public void setVitaminE(Double vitaminE) {
        this.vitaminE = vitaminE;
    }

    public Double getVitaminB12() {
        return vitaminB12;
    }

    public void setVitaminB12(Double vitaminB12) {
        this.vitaminB12 = vitaminB12;
    }

    public Integer getGlycemicIndex() {
        return glycemicIndex;
    }

    public void setGlycemicIndex(Integer glycemicIndex) {
        this.glycemicIndex = glycemicIndex;
    }

    public Integer getHistamineSymptomSeverity() {
        return histamineSymptomSeverity;
    }

    public void setHistamineSymptomSeverity(Integer histamineSymptomSeverity) {
        this.histamineSymptomSeverity = histamineSymptomSeverity;
    }

    public Integer getHistamineLevel() {
        return histamineLevel;
    }

    public void setHistamineLevel(Integer histamineLevel) {
        this.histamineLevel = histamineLevel;
    }

    @Override
    public String toString() {
        return "FoodEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", protein=" + protein +
                ", carbohydrate=" + carbohydrate +
                ", fat=" + fat +
                ", energy=" + energy +
                ", fiber=" + fiber +
                ", zinc=" + zinc +
                ", magnesium=" + magnesium +
                ", manganese=" + manganese +
                ", cholesterol=" + cholesterol +
                ", selenium=" + selenium +
                ", vitaminD=" + vitaminD +
                ", vitaminC=" + vitaminC +
                ", vitaminE=" + vitaminE +
                ", vitaminB12=" + vitaminB12 +
                ", glycemicIndex=" + glycemicIndex +
                ", histamineSymptomSeverity=" + histamineSymptomSeverity +
                ", histamineLevel=" + histamineLevel +
                '}';
    }
}
