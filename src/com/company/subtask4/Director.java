package com.company.subtask4;

public class Director {
    private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void makeSimple() {
        System.out.println("We are building new crib in simple option: ");
        this.builder.reset();
        this.builder.buildWalls();
        this.builder.buildDoors();
        this.builder.buildWindows();
    }

    public void makeStandard() {
        System.out.println("We are building new crib in standard option: ");
        this.builder.reset();
        this.builder.buildWalls();
        this.builder.buildDoors();
        this.builder.buildWindows();
        this.builder.buildRoof();
    }

    public void makeMaster() {
        System.out.println("We are building new crib in master option: ");
        this.builder.reset();
        this.builder.buildWalls();
        this.builder.buildDoors();
        this.builder.buildWindows();
        this.builder.buildRoof();
        this.builder.buildGarage();
    }
}
