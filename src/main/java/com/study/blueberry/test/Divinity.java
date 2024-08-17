package com.study.blueberry.test;

public class Divinity {
    public static void main(String[] args) {

        Character ipan = new Ipan(4800, 900, 700);
        Character beast = new Beast(5000, 2900, 3100);

        ipan.showStatus();
        System.out.println();
        beast.showStatus();
    }
}

// 인터페이스 정의
interface Showable {
    void showStatus();
}

abstract class Character implements Showable {
    protected int hp;
    protected int magicDefence;
    protected int physicalDefence;

    public Character(int hp, int magicDefence, int physicalDefence) {
        this.hp = hp;
        this.magicDefence = magicDefence;
        this.physicalDefence = physicalDefence;
    }

    public int calculateMagicAttack(int magicAttack) {
        int magic = magicDefence - magicAttack;
        return magic < 0 ? magic + hp : magic;
    }

    public int calculatePhysicAttack(int physicAttack) {
        int physic = physicalDefence - physicAttack;
        return physic < 0 ? physic + hp : physic;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // 추상 클래스가 Showable 인터페이스의 showStatus 메서드를 구현하지 않음.
    // 이를 구체적인 하위 클래스가 구현하게 함.
}

class Ipan extends Character {

    public Ipan(int hp, int magicDefence, int physicalDefence) {
        super(hp, magicDefence, physicalDefence);
    }

    @Override
    public void showStatus() {
        System.out.println("Ipan");
        System.out.println("HP: " + hp);
        System.out.println("Magic Defence: " + magicDefence);
        System.out.println("Physical Defence: " + physicalDefence);
    }
}

class Beast extends Character {

    public Beast(int hp, int magicDefence, int physicalDefence) {
        super(hp, magicDefence, physicalDefence);
    }

    @Override
    public void showStatus() {
        System.out.println("Beast");
        System.out.println("HP: " + hp);
        System.out.println("Magic Defence: " + magicDefence);
        System.out.println("Physical Defence: " + physicalDefence);
    }
}
