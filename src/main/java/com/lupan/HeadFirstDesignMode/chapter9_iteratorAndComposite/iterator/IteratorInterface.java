package com.lupan.HeadFirstDesignMode.chapter9_iteratorAndComposite.iterator;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/24 0024
 */
public interface IteratorInterface<T> {

    boolean hasNext();
    T next();
}
