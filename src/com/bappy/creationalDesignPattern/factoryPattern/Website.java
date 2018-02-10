package com.bappy.creationalDesignPattern.factoryPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website(){
        this.createWebsite();
    }

    protected abstract void createWebsite();

    public List<Page> getPages() {
        return pages;
    }
}
