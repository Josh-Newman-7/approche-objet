package fr.diginamic.jdr;

public abstract class Creature {
    private int strength;
    private int lifePoint;

    public Creature(int strength, int lifePoint) {
        this.strength = strength;
        this.lifePoint = lifePoint;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }
}
