package com.company.animals;

public class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public Double eat() {
        if (this.weight > 0) {
            double oldWeight = this.weight;
            this.weight = 0.0;
            return oldWeight;
        } else {
            System.out.println("animal cannot be eaten");
            return 0.0;
        }
    }
}
