package com.company;
import java.util.Scanner;
public class DogTest {
    public static void main(String[] args){
        Dog[] pets= new Dog[2];
        pets[0] = new Dog("Lili",6);
        pets[1] = new Dog("Korjik");
        pets[1].setAge(12);
        System.out.print(pets[1]);
        pets[0].intoHumanAge();
    }
}
