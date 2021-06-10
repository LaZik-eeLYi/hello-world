package com.lupan.ehcache;

import java.io.Serializable;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/4/6 0006
 */
public class Student implements Serializable {

    private String id;
    private String name;
    private int num;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
