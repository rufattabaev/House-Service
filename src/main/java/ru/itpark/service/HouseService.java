package ru.itpark.service;

import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.List;

public class HouseService {

    private List<House> houseList = new ArrayList<>();

    public void addNew(House house) {
        houseList.add(house);
    }

    public List<House> searchByPrice(int min, int max) {
        List<House> result = new ArrayList<>();
        for (House house : houseList) {
            if (house.getPrice() >= min && house.getPrice() <= max) {
                result.add(house);
            }
        }
        return result;
    }

    public List<House> searchByArea (String area){
        List<House> result = new ArrayList<>();
        for (House house : houseList) {
            if (house.getAreaName() == area) {
                result.add(house);
            }
        }
        return result;
    }

    public List<House> searchByBothData(int min, int max, String area){
        List<House> result = new ArrayList<>();
        for (House house : houseList) {
            if (house.getPrice() >= min && house.getPrice() <= max && house.getAreaName() == area){
                    result.add(house);
            }
        }
        return result;
    }
}
