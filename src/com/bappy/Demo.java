package com.bappy;

public class Demo {
    public static void main(String[] args) {
        String str = new String("bbb");
        String str1 = new String("bbb");
        String s1 = "bbb";
        String s2 = "bbb";

        System.out.println(s1==s2);

        System.out.println("Using == operator: "+ (str =="bbb"));
        System.out.println("Using equals: "+str.equals("bbb"));
    }
}
