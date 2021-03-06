package com.company.subtask4;

public class HouseBuilder implements Builder {
    private House product;

    HouseBuilder() {
        this.reset();
    }

    public House getResult() {
        House product = this.product;
        this.reset();
        return product;
    }

    @Override
    public void reset() {
        this.product = new House();
    }

    @Override
    public void buildWalls() {
        product.setWalls(true);
        System.out.println("Walls built.");
    }

    @Override
    public void buildDoors() {
        product.setDoors(true);
        System.out.println("Doors built.");
    }

    @Override
    public void buildWindows() {
        product.setWindows(true);
        System.out.println("Windows built.");
    }

    @Override
    public void buildRoof() {
        product.setRoof(true);
        System.out.println("Roof built.");
    }

    @Override
    public void buildGarage() {
        product.setGarage(true);
        System.out.println("Garage built.");
    }

    public House getProduct() {
        return this.product;
    }
}
