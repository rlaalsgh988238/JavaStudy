package com.study.blueberry.test;

import java.util.Scanner;

public class What {
    public static void main(String[] args) {
        CustomCar customCar = new CustomCar("red", 7, 3);
        customCar.printInfo1();
        customCar.printInfo2();
        CustomCar customCar2 = new CustomCar();
        customCar2.printInfo1();
        customCar2.printInfo2();
    }

}
class Car {
    int wheelNumber = 4;
    Boolean hasHandle = true;
    String sound = "brbr";
    void printInfo1(){
        System.out.println(wheelNumber);
        System.out.println(hasHandle);
        System.out.println(sound);
    }
    static int a =4;
}

class MyCar extends Car {
    String carColor = "red";

    MyCar(){
        wheelNumber = 3;
    }
    int doorNum = 2;
    void printInfo2(){

        System.out.println(carColor);
        System.out.println(doorNum);
    }
    void printMessage(String msg){
        System.out.println(msg);
    }

}
class CustomCar extends Car{
    String color;
    int doorNumber;
    void printInfo2()
    {
        System.out.println(color);
        System.out.println(wheelNumber);
        System.out.println(doorNumber);
    }
    CustomCar(String color , int wheelNumber, int  doorNum){
        this.color = color;
        this.wheelNumber = wheelNumber;
        doorNumber = doorNum;

    }
    CustomCar(){
        this.color = "red";
        this.wheelNumber = 4;
        doorNumber = 2;
    }
}