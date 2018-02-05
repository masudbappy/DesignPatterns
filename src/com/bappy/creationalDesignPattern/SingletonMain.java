package com.bappy.creationalDesignPattern;

public class SingletonMain {
    public static void main(String args[]){

        DBSingleton singleton = DBSingleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton);
    }
}
