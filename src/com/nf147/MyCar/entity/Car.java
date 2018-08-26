package com.nf147.MyCar.entity;
public class Car {
    private int id;  //编号
    private String name; //品牌
    private float price;//价格
    private String color;//颜色
    private String manufacturer;//制造厂商


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public Car(){}
    public Car(int id, String name, float price, String color, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.manufacturer = manufacturer;
    }

}