package com.company.subtask3;

public class Main {

    public static void main(String[] args) {
        FurnitureFactory modernFurniture = new ModernFurnitureFactory();
        Chair modernFurnitureChair = modernFurniture.createChair();
        CoffeeTable modernFurnitureCoffeeTable = modernFurniture.createCoffeeTable();
        Sofa modernFurnitureSofa = modernFurniture.createSofa();
    }
}
