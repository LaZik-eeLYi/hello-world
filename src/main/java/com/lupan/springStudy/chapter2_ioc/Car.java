package com.lupan.springStudy.chapter2_ioc;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/4/8 0008
 */
public class Car {

    private String id;
    private String name;
    private User User;

    public Car() {
    }

    public Car(String id, String name, User user) {
        this.id = id;
        this.name = name;
        User = user;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(User user) {
        User = user;
    }

    @Override
    public String toString(){
         return String.format("id=%s,name=%s,user=%s",this.id,this.name,this.User.getName());
    }
}
