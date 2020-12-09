package com.company;
import java.util.Scanner;


public class Dog {
        String name;
        int age;
        public Dog(String a,int b){
            name=a;
            age=b;
        }
    public Dog(String n){
        name =n;
        age=0;
    }
    public Dog(){
        name="Pup";
        age=0;
    }
        public void setName(String name){
            this.name=name;
        }
        public void setAge(int age){
            this.age=age;
        }
        public String getName(String name){
            return name;
        }
        public String getAge(String age){
            return age;
        }
        public void intoHumanAge(){
            System.out.println(name+"'s age in human years is "+age*7+" years");
        }
        public String toString(){
            return this.name+", age "+this.age;
        }
    }
