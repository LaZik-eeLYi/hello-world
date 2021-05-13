package com.lupan.HeadFirstDesignMode.chapter9_iteratorAndComposite.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/24 0024
 */
public class ListMenu {

    List<String> menus;

    public ListMenu() {
        this.menus = new ArrayList<>();
        menus.add("菜项1");
        menus.add("菜项2");
        menus.add("菜项3");
        menus.add("菜项4");
    }

    public Iterator getIterator(){
        return menus.iterator();
    }
}
