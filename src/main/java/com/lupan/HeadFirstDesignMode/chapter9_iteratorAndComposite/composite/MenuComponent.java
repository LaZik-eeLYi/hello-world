package com.lupan.HeadFirstDesignMode.chapter9_iteratorAndComposite.composite;

import java.util.List;

/**
 * TODO 组合通用父类(所有子类独有的方法集中起来，如果不支持则抛出异常)
 *
 * @author lupan
 * @version 2016/3/24 0024
 */
public abstract class MenuComponent {

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException("不支持添加子项！");
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException("不支持删除子项！");
    }

    public List<MenuComponent> getChilds(){
        throw new UnsupportedOperationException("不支持获取子项！");
    }

    public String getPrice() {
        throw new UnsupportedOperationException("不支持获取价格！");
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException("不支持判断是否为素食！");
    }

    public abstract void print();

    public MenuComponentIterator getIterator(){
        throw new UnsupportedOperationException("不支持迭代器！");
    }
}
