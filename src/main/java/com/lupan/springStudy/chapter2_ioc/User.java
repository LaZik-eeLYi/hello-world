package com.lupan.springStudy.chapter2_ioc;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/4/8 0008
 */
public class User {
    private String id;
    private String name;
    private double weight;
    private double height;
    private List<String> hobbies;
    private Map<Integer,String> favorites;
    private Set<String> knowledges;

    public User() {
    }

    public User(String id, String name, double weight, double height) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setFavorites(Map<Integer, String> favorites) {
        this.favorites = favorites;
    }

    public void setKnowledges(Set<String> knowledges) {
        this.knowledges = knowledges;
    }

    public String getName() {
        return name;
    }
}
