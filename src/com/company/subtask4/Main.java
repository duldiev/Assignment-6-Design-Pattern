package com.company.subtask4;

public class Main {

    public static void main(String[] args) {
        HouseBuilder new_Builder = new HouseBuilder();
        Director new_Boss = new Director(new_Builder);
        new_Boss.makeStandard();
        House new_Crib = new_Builder.getProduct();
        System.out.println("Your new crib is made by BI Group (standard): ");
        System.out.println("Walls: " + isExist(new_Crib.isWalls()));
        System.out.println("Doors: " + isExist(new_Crib.isDoors()));
        System.out.println("Windows: " + isExist(new_Crib.isWindows()));
        System.out.println("Roof: " + isExist(new_Crib.isRoof()));
        System.out.println("Garage: " + isExist(new_Crib.isGarage()));
    }

    public static String isExist(boolean x) {
        if (x)
            return "Yes";
        else
            return "No";
    }
}
