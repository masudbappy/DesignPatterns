package com.bappy.creationalDesignPattern.singletonPattern;

public class DBSingleton {
    // variable for eagarly loading
//    private static DBSingleton instance = new DBSingleton();

    // variable for lazy loading
     private static DBSingleton instance = null;

    private DBSingleton(){

    }

    // method for eagerly loading
    /*public static DBSingleton getInstance() {

        return instance;
    }*/


    // method for lazy loading
    /*public static DBSingleton getInstance() {
        if (instance == null){
            instance = new DBSingleton();
        }
        return instance;
    }*/

    //method for thread safe
    public static DBSingleton getInstance(){
        if (instance == null){
            synchronized (DBSingleton.class){
                if (instance == null){
                    instance = new DBSingleton();
                }
            }
        }

        return instance;
    }
}
