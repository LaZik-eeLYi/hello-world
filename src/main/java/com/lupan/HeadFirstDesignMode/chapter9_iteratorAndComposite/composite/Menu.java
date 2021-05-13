package com.lupan.HeadFirstDesignMode.chapter9_iteratorAndComposite.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/24 0024
 */
public class Menu extends MenuComponent{

    private String name;
    private List<MenuComponent> childs;

    public Menu(String name) {
        this.name = name;
        this.childs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(MenuComponent menuComponent){
        childs.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        childs.remove(menuComponent);
    }

    public List<MenuComponent> getChilds(){
        return this.childs;
    }

    @Override
    public void print(){
        System.out.println("menu:"+this.name);
        Iterator<MenuComponent> iterator = childs.iterator();
        while (iterator.hasNext()){
            MenuComponent child = iterator.next();
            child.print();
        }
    }

    public MenuComponentIterator getIterator(){
        return new MenuComponentIterator(childs.iterator());
    }
}
