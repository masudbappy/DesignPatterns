package com.bappy;

public class Demo {
    public static void main(String[] args) {
        int[] array = {2,33,44,22,65,43};
        int max =0;
        for (int i =0; i< array.length; i++){
            if (max<array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
