package com.lupan.HeadFirstDesignMode.chapter9_iteratorAndComposite.composite;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/24 0024
 */
public class Item extends  MenuComponent {

    private String name;
    private String price;
    private boolean vegetarian;

    public Item(String name, String price, boolean vegetarian) {
        this.name = name;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print(){
        System.out.println("----item："+this.name+" "+this.getPrice());
    }
}
