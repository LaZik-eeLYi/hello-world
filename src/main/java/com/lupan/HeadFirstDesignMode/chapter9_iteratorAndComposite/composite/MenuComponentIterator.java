package com.lupan.HeadFirstDesignMode.chapter9_iteratorAndComposite.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * TODO 树形结构迭代器，递归调用
 *
 * @author lupan
 * @version 2016/3/24 0024
 */
public class MenuComponentIterator implements Iterator<MenuComponent> {

    Stack<Iterator<MenuComponent>> stack;

    public MenuComponentIterator(Iterator<MenuComponent> iterator) {
        this.stack = new Stack<>();
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty()){
            return false;
        }else{
            Iterator iterator = stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
               return hasNext();
            }else{
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        if(hasNext()){
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent menuComponent = iterator.next();
            if(menuComponent instanceof Menu){
               stack.push(menuComponent.getIterator());
            }
            return menuComponent;
        }else{
            return null;
        }
    }
}
