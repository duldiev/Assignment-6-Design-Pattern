package com.company.subtask2;

public class Main {

    public static void main(String[] args) {
        RoadLogistics RoadLog = new RoadLogistics();
        Transport ObjRoad_1 = RoadLog.createTransport();
        ObjRoad_1.deliver();

        SeaLogistics SeaLog = new SeaLogistics();
        Transport ObjSea_1 = SeaLog.createTransport();
        ObjSea_1.deliver();
    }
}
