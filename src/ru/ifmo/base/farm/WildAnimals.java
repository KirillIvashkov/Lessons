package ru.ifmo.base.farm;

public class WildAnimals extends Animals implements canHunt {
    protected int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void hunt() {

    }

    @Override
    public void kill() {

    }
}
