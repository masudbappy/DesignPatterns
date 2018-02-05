package com.bappy;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    int id;
    String name;
    String author;

    public HashMapDemo(int id, String name, String author){
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public static void main(String[] args) {
        HashMapDemo obj1 = new HashMapDemo(1,"Java","bappy");
        HashMapDemo obj2 = new HashMapDemo(2,"php","rabby");
        HashMapDemo obj3 = new HashMapDemo(3,"html","rana");
        HashMap<Integer,HashMapDemo> map = new HashMap<>();
        map.put(101,obj1);
        map.put(102,obj2);
        map.put(103,obj3);

        for(Map.Entry<Integer,HashMapDemo> entry:map.entrySet()){
            System.out.println(entry.getKey());
        }

    }
}
