package com.example.lesson23;

public class Unit {
    public String name;
    public int health;

    public Unit(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String printInfo() {
        return "name "+ name + " health " + health;
    }
}

class Robot extends Unit {
    private int armor;

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Robot(String name, int health, int armor) {
        super(name, health);
        this.armor = armor;
    }

    @Override
    public String printInfo() {
        return "robot " + super.printInfo() + " armor " + armor + "\n" ;
    }
}

class Wizard extends Unit {
    private int mana;

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Wizard(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    @Override
    public String printInfo() {
        return "wizard "+super.printInfo() + " mana " +mana+"\n";
    }
}

class Warrior extends Unit {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public String printInfo() {
        return super.printInfo()+"\n";
    }

    public void attack() {
    }
}