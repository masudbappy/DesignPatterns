package com.bappy.creationalDesignPattern.factoryPattern;

public class WebsiteFactory {
    /*public static Website getWebsites(String siteType){
        switch (siteType){
            case "blog":{
                return new Blog();
            }
            case "shop":{
                return new Shop();
            }
            default:{
                return null;
            }
        }
    }*/
    //Above thing is also done by enum

    public static Website getWebsites(WebsiteType websiteType){

        switch (websiteType){
            case BLOG:{
                return new Blog();
            }
            case SHOP:{
                return new Shop();
            }
            default:{
                return null;
            }
        }
    }
}
