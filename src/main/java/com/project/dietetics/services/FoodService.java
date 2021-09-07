package com.project.dietetics.services;

import com.project.dietetics.database.entities.FoodEntity;
import com.project.dietetics.database.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<FoodEntity> getAllFoods() {
        Iterable<FoodEntity> iterableFoods = foodRepository.findAll();

        List<FoodEntity> foods = new ArrayList<>();

        for (FoodEntity food : iterableFoods) {
            foods.add(food);
        }

        return foods;
    }
}
