package com.project.dietetics.services;

import com.project.dietetics.database.entities.Food;
import com.project.dietetics.database.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    public Food getFoodById(Integer id) {
        return foodRepository.getById(id);
    }
}
