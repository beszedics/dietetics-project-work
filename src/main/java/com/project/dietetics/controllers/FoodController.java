package com.project.dietetics.controllers;

import com.project.dietetics.database.entities.Food;
import com.project.dietetics.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/foods")
@CrossOrigin
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<Food> getAllFoods() {
        return foodService.getAllFoods();
    }

    @GetMapping(value = "/{id}")
    public Food getFoodById(@PathVariable(name = "id") Integer id) {
        return foodService.getFoodById(id);
    }
}
