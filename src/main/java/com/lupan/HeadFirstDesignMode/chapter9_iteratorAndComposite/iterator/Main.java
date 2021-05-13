package com.lupan.HeadFirstDesignMode.chapter9_iteratorAndComposite.iterator;

import java.util.Iterator;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/24 0024
 */
public class Main {
    public static void main(String[] args){
        ArrayMenu arrayMenu = new ArrayMenu();
        IteratorInterface arrayMenuIterator = arrayMenu.getIterator();
        while (arrayMenuIterator.hasNext()){
            System.out.print(arrayMenuIterator.next()+",");
        }

        System.out.println("");

        ListMenu listMenu = new ListMenu();
        Iterator listMenuIterator = listMenu.getIterator();
        while (listMenuIterator.hasNext()){
            System.out.print(listMenuIterator.next()+",");
        }
    }
}
