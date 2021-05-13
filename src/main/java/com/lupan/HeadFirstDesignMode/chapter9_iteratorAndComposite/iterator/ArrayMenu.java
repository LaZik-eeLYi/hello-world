package com.lupan.HeadFirstDesignMode.chapter9_iteratorAndComposite.iterator;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/24 0024
 */
public class ArrayMenu {

    private String[] menus;

    public ArrayMenu() {
        this.menus = new String[]{"菜单1","菜单2","菜单3","菜单4"};
    }

    public IteratorInterface getIterator(){
        return new ArrayMenuIterator(menus);
    }
}
