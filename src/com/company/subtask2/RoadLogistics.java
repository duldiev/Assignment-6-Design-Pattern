package com.company.subtask2;

public class RoadLogistics extends Logistics {

    @Override
    Transport createTransport() {
        return new Truck();
    }
}
