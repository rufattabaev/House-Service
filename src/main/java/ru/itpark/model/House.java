package ru.itpark.model;

public class House {
    private int id;
    private int price;
    private String areaName;

    public House(int id, int price, String areaName) {
        this.id = id;
        this.price = price;
        this.areaName = areaName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", price=" + price +
                ", areaName='" + areaName + '\'' +
                '}';
    }
}
