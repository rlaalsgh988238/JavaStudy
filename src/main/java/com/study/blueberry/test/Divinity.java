package com.study.blueberry.test;

public class Divinity {
    public static void main(String[] args) {

        Ipan ipan = new Ipan(4800, 900, 700);
        Beast beast = new Beast(5000, 2900, 3100);

        ipan.ShowStatus();
        System.out.println();
        beast.ShowStatus();
    }
}

class Character {
    protected int hp;
    protected int magicDefence;
    protected int physicalDefence;
    protected int magicAttack;
    protected int physicAttack;

    public Character(int hp, int magicDefence, int physicalDefence) {
        this.hp = hp;
        this.magicDefence = magicDefence;
        this.physicalDefence = physicalDefence;
    }

    public int MagicAttack() {
        int magic = magicDefence - magicAttack;
        if (magic < 0) {
            return magic + hp;
        }
        return magic;
    }

    public int PhysicAttack() {
        int physic = physicalDefence - physicAttack;
        if (physic < 0) {
            return physic + hp;
        }
        return physic;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

class Ipan extends Character {

    public Ipan(int hp, int magicDefence, int physicalDefence) {
        super(hp, magicDefence, physicalDefence);
        this.hp = 4800;
        this.magicDefence = 900;
        this.physicalDefence = 700;
    }

    void ShowStatus() {
        System.out.println("Ipan");
        System.out.println("HP: " + hp);
        System.out.println("Magic Defence: " + magicDefence);
        System.out.println("Physical Defence: " + physicalDefence);
    }
}
class Beast extends Character {
    public Beast(int hp, int magicDefence, int physicalDefence) {
        super(hp, magicDefence, physicalDefence);
        this.hp = 5000;
        this.magicDefence = 2900;
        this.physicalDefence = 3100;
    }
    void ShowStatus() {
        System.out.println("Beast");
        System.out.println("HP: " + hp);
        System.out.println("Magic Defence: " + magicDefence);
        System.out.println("Physical Defence: " + physicalDefence);
    }
}
