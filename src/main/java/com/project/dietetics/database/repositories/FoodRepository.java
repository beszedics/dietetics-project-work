package com.project.dietetics.database.repositories;

import com.project.dietetics.database.entities.FoodEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<FoodEntity, Integer> {

}
