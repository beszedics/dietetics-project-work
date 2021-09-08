package com.project.dietetics.controllers;

import com.project.dietetics.services.FoodService;
import com.project.dietetics.services.models.FoodModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<FoodModel> getAllFoods() {
        return foodService.getAllFoods();
    }

    @GetMapping(value = "/{id}")
    public FoodModel getFoodById(@PathVariable(name = "id") Integer id) {
        return foodService.getFoodById(id);
    }
}
