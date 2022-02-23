package com.javacto.day2.a_constructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * liu
 **/
public class User {
    private int id;
    private String name;
    private List lists;
    private String[] sts;
    private Map map;

    public User(int id, String name, List lists, String[] sts) {
        this.id = id;
        this.name = name;
        this.lists = lists;
        this.sts = sts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lists=" + lists +
                ", sts=" + Arrays.toString(sts) +
                ", map=" + map +
                '}';
    }
}
