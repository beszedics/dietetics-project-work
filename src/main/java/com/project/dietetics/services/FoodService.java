package com.project.dietetics.services;

import com.project.dietetics.database.entities.FoodEntity;
import com.project.dietetics.database.repositories.FoodRepository;
import com.project.dietetics.services.converters.FoodConverter;
import com.project.dietetics.services.models.FoodModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<FoodModel> getAllFoods() {
        Iterable<FoodEntity> iterableFoods = foodRepository.findAll();

        FoodConverter foodConverter = new FoodConverter();      // TODO: @Autowired

        List<FoodModel> foods = new ArrayList<>();

        for (FoodEntity food : iterableFoods) {
            foods.add(foodConverter.entityToModel(food));
        }

        return foods;
    }

    public FoodModel getFoodById(Integer id) {
        Optional<FoodEntity> food = foodRepository.findById(id);

        FoodConverter foodConverter = new FoodConverter();      // TODO: @Autowired

        FoodModel foodModel = null;

        if (food.isPresent()) {
            foodModel = foodConverter.entityToModel(food.get());
        }

        return foodModel;
    }
}
