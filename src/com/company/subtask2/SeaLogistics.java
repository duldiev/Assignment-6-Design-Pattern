package com.company.subtask2;

public class SeaLogistics extends Logistics {

    @Override
    Transport createTransport() {
        return new Ship();
    }
}
