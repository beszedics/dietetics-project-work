package com.project.dietetics.services.converters;

import com.project.dietetics.database.entities.UserEntity;
import com.project.dietetics.services.models.UserModel;

public class UserConverter {

    public UserModel entityToModel(UserEntity userEntity) {
        UserModel userModel = new UserModel();
        userModel.setId(userEntity.getId());
        userModel.setName(userEntity.getName());
        userModel.setWeight(userEntity.getWeight());
        userModel.setHeight(userEntity.getHeight());
        userModel.setAge(userEntity.getAge());

        if (userEntity.getSex()) {
            userModel.setSex("Nő");
        } else {
            userModel.setSex("Férfi");
        }

        switch (userEntity.getActivity()) {
            case 0:
                userModel.setActivity("Nem aktív");
                break;
            case 1:
                userModel.setActivity("Aktív");
                break;
            case 2:
                userModel.setActivity("Nagyon aktív");
                break;
            default:
                userModel.setActivity("Nem ismert");
                break;
        }

        userModel.setDiabetesType(userEntity.getDiabetesType());

        return userModel;
    }
}
