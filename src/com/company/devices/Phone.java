package com.company.devices;

import com.company.animals.Human;

public class Phone extends Device {
    public final Double screenSize;
    public String os;

    public static String greetings = "HELLO";

    public Phone(String producer, String model, Double screenSize, String os) {
        this.screenSize = screenSize;
        this.os = os;
    }

    public String toString() {
        return "producer: " + this.producer
                + " model: " + this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is turned on");
    }


    @Override
    public boolean sell(Human seller, Human buyer, Double price) {
        if (!(seller.phone == this)) {
            return false;}
        if (!(buyer.cash > price)) {
            return false; }
        seller.phone = null;
        buyer.phone = this;
        seller.cash += price;
        buyer.cash -= price;
        System.out.println("the device has been sold");
            return true;
        }
    }
