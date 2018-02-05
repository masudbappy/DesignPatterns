package com.bappy.creationalDesignPattern.builderPattern;

public class LunchBuilderMain {
    public static void main(String[] args) {
        LunchBuilder.Builder builder = new LunchBuilder.Builder();
        builder.bread("ALL TIME").condiment("condiments").dressing("Dress").meat("BEAF");

        LunchBuilder lunchBuilder = builder.build();
        System.out.println(lunchBuilder.getBread());
        System.out.println(lunchBuilder.getCondiments());
        System.out.println(lunchBuilder.getDressing());
        System.out.println(lunchBuilder.getMeat());
    }
}
