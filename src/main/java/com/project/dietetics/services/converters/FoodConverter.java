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
                foodModel.setGlycemicIndex("Nem okoz tünetet, nem tartalmaz hisztamint");
                break;
            case 1:
                foodModel.setGlycemicIndex("Nem okoz tünetet, de romlandó és gyorsan keletkezhet benne magas hisztamin szint");
                break;
            case 2:
                foodModel.setGlycemicIndex("Enyhe tünetet okoz, hisztamin tartalmú");
                break;
            case 3:
                foodModel.setGlycemicIndex("Közepesen magas hisztamin tartalmú, jelentős tüneteket okozhat");
                break;
            case 4:
                foodModel.setGlycemicIndex("BLA");
                break;
            case 5:
                foodModel.setGlycemicIndex("Súlyos tünetet okoz, hisztamin tartalmú");
                break;
            default:
                foodModel.setGlycemicIndex("Nincs adat róla");
                break;
        }

        switch (foodEntity.getHistamineReaction()) {
            // TODO: Constants
            case 0:
                foodModel.setHistamineReaction("Nem tartalmaz hisztamint");
                break;
            case 1:
                foodModel.setHistamineReaction("Kis mennyiségben fogyasztható, kevés hisztamint tartalmaz");
                break;
            case 2:
                foodModel.setHistamineReaction("Közepes hisztamint tartalmaz");
                break;
            case 3:
                foodModel.setHistamineReaction("Romlandó, gyorsan keletkezhet benne hisztamin");
                break;
            case 4:
                foodModel.setHistamineReaction("Hisztamin felszabadító");
                break;
            case 5:
                foodModel.setHistamineReaction("Hisztamint tartalmaz");
            default:
                foodModel.setGlycemicIndex("Nincs adat róla");
                break;
        }

        return foodModel;
    }
}
