package com.bappy.creationalDesignPattern.factoryPattern;

public class FactoryDemo {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsites(WebsiteType.BLOG);
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsites(WebsiteType.SHOP);
        System.out.println(site.getPages());
    }
}
