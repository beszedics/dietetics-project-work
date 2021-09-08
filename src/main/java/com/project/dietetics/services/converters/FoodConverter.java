package com.project.dietetics.services.converters;

import com.project.dietetics.database.entities.FoodEntity;
import com.project.dietetics.services.models.FoodModel;

public class FoodConverter {

    public FoodModel entityToModel(FoodEntity foodEntity) {
        // TODO: builder
        FoodModel foodModel = new FoodModel();
        foodModel.setId(foodEntity.getId());
        foodModel.setName(foodEntity.getName());
        foodModel.setProtein(foodEntity.getProtein());
        foodModel.setCarbohydrate(foodEntity.getCarbohydrate());
        foodModel.setFat(foodEntity.getFat());
        foodModel.setEnergy(foodEntity.getEnergy());
        foodModel.setFiber(foodEntity.getFiber());
        foodModel.setZinc(foodEntity.getZinc());
        foodModel.setMagnesium(foodEntity.getMagnesium());
        foodModel.setManganese(foodEntity.getManganese());
        foodModel.setCholesterol(foodEntity.getCholesterol());
        foodModel.setSelenium(foodEntity.getSelenium());
        foodModel.setVitaminD(foodEntity.getVitaminD());
        foodModel.setVitaminC(foodEntity.getVitaminC());
        foodModel.setVitaminE(foodEntity.getVitaminE());
        foodModel.setVitaminB12(foodEntity.getVitaminB12());

        switch (foodEntity.getGlycemicIndex()) {
            // TODO: Constants
            case 0:
                foodModel.setGlycemicIndex("Nagyon alacsony");
                break;
            case 1:
                foodModel.setGlycemicIndex("Alacsony");
                break;
            case 2:
                foodModel.setGlycemicIndex("Közepes");
                break;
            case 3:
                foodModel.setGlycemicIndex("Magas");
                break;
            default:
                foodModel.setGlycemicIndex("Nincs adat róla");
                break;
        }

        switch (foodEntity.getHistamineSymptomSeverity()) {
            // TODO: Constants
            case 0:
                foodModel.setHistamineSymptomSeverity("Nem okoz tünetet");
                break;
            case 1:
                foodModel.setHistamineSymptomSeverity("Enyhe tünetet okoz");
                break;
            case 2:
                foodModel.setHistamineSymptomSeverity("Közepes tünetet okoz");
                break;
            case 3:
                foodModel.setHistamineSymptomSeverity("Jelentős tünetet okoz");
                break;
            case 4:
                foodModel.setHistamineSymptomSeverity("Súlyos tünetet okoz");
                break;
            case -1:
                foodModel.setHistamineSymptomSeverity("Nincs adat róla");
            default:
                foodModel.setGlycemicIndex("Nem létezik");
                break;
        }

        switch (foodEntity.getHistamineLevel()) {
            case 0:
                foodModel.setHistamineLevel("Nem tartalmaz hisztamint");
                break;
            case 1:
                foodModel.setHistamineLevel("Kis mennyiségben fogyasztható, kevés hisztamint tartalmaz");
                break;
            case 2:
                foodModel.setHistamineLevel("Közepes hisztamint tartalmaz");
                break;
            case 3:
                foodModel.setHistamineLevel("Romlandó, gyorsan keletkezhet benne hisztamin");
                break;
            case 4:
                foodModel.setHistamineLevel("Hisztamin felszabadító");
                break;
            case 5:
                foodModel.setHistamineLevel("Hisztamint tartalmaz");
                break;
            case -1:
                foodModel.setHistamineLevel("Nincs adat róla");
                break;
            default:
                foodModel.setHistamineLevel("Nem létezik");
                break;
        }

        return foodModel;
    }
}
