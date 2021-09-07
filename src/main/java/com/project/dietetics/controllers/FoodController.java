package com.project.dietetics.controllers;

import com.project.dietetics.database.entities.FoodEntity;
import com.project.dietetics.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<FoodEntity> getAllFoods() {
        return foodService.getAllFoods();
    }
}
