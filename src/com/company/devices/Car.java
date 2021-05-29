package com.company.devices;

import com.company.animals.Human;

public abstract class Car extends Device {

    public Double engineSize;
    public String fuelType;

    @Override
    public void turnOn() {
        System.out.println("Car is turned on");
    }

    @Override
    public boolean sell(Human seller, Human buyer, Double price) {
        if (!(seller.car == this)) {
        return false; }
        if (!(buyer.cash > price)) {
            return false; }
        seller.car = null;
        buyer.car = this;
        seller.cash += price;
        buyer.cash -= price;
        System.out.println("the device has been sold");
        return true;
    }

    abstract void refuel();

}
