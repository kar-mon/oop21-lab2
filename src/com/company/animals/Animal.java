package com.company.animals;

public class Animal implements Feadable {
    final static Double DEFAULT_DOG_WEIGHT = 6.0;
    public String name;
    final static Double DEFAULT_CAT_WEIGHT = 1.0;
    final static Double DEFAULT_ELEPHANT_WEIGHT = 2000.0;
    final static Double DEFAULT_WEIGHT = 0.5;
    public final String species;
    protected Double weight;

    public Animal(String species) {
        this.species = species;

        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "cat":
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case "elephant":
                this.weight = DEFAULT_ELEPHANT_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_WEIGHT;
        }

    }
    @Override
    public boolean feed() {
        return true;
    }

    void printWeight() {
        System.out.println(weight);
    }

    @Override
    public boolean feed(Double foodWeight) {
        weight += foodWeight;
        System.out.println("thx for food, bro");
        System.out.println("my weight is now " + weight);
    return true;}

    String returnSpeciesAndName() {
        return species + " " + name;
    }

    String returnNameAndOwner(String owner) {
        return name + " " + owner;
    }
}
