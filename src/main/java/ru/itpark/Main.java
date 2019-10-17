package ru.itpark;

import ru.itpark.model.House;
import ru.itpark.service.HouseService;

public class Main {
    public static void main(String[] args) {
        HouseService houseService = new HouseService();

        houseService.addNew(new House(1, 1_000_000, "Кировский"));
        houseService.addNew(new House(2, 1_100_000, "Московский"));
        houseService.addNew(new House(3, 1_200_000, "Авиастроительный"));
        houseService.addNew(new House(4, 1_300_000, "Приволжский"));
        houseService.addNew(new House(5, 1_400_000, "Вахитовский"));
        houseService.addNew(new House(6, 1_500_000, "Ново-савиновский"));
        houseService.addNew(new House(7, 1_600_000, "Советский"));
        houseService.addNew(new House(8, 1_700_000, "Советский"));

        System.out.println(houseService.searchByPrice(1_000_000, 1_300_000));

        System.out.println(houseService.searchByArea("Советский"));

        System.out.println(houseService.searchByBothData(1_000_000, 1_100_000, "Советский"));

        System.out.println(houseService.searchByBothData(1_000_000, 2_000_000, "Советский"));
    }
}
