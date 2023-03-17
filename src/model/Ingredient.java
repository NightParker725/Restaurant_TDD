package model;

import exceptions.NegativeNumberException;

public class Ingredient {
    private String name;
    private int weight;

    public Ingredient(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void verifyWeight(int weight) throws NegativeNumberException{
        if (weight < 0) throw new NegativeNumberException();
    }

    public void addWeight(int weight) throws NegativeNumberException {
            verifyWeight(weight);
            this.weight += weight;
    }

    public void removeWeight(int weight) throws NegativeNumberException {
        verifyWeight(weight);
        this.weight -= weight;
    }
}
