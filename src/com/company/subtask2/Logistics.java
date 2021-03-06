package com.company.subtask2;

abstract class Logistics {
    abstract Transport createTransport();

    public void planDeliver() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
