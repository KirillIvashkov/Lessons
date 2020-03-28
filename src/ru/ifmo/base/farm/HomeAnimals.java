package ru.ifmo.base.farm;

public class HomeAnimals extends Animals implements CanRest{
    protected int health;
    protected int resources;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    @Override
    public void rest() {

    }
}
