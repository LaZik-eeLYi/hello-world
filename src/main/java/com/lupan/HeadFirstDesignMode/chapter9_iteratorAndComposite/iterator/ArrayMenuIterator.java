package com.lupan.HeadFirstDesignMode.chapter9_iteratorAndComposite.iterator;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/24 0024
 */
public class ArrayMenuIterator implements IteratorInterface<String> {
    private String[] menus;
    private int position;

    public ArrayMenuIterator(String[] menus) {
        this.menus = menus;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if(position<menus.length){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String next() {
        String item = menus[position];
        position ++;
        return item;
    }
}
