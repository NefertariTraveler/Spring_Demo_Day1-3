package com.javacto.day1.f_setter;

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
    private UserVo userVo;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lists=" + lists +
                ", sts=" + Arrays.toString(sts) +
                ", map=" + map +
                ", userVo=" + userVo +
                '}';
    }

    //只需要生成setter 方法就可以注入，如果需要取值，就需要getter方法
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLists(List lists) {
        this.lists = lists;
    }

    public void setSts(String[] sts) {
        this.sts = sts;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setUserVo(UserVo userVo) {
        this.userVo = userVo;
    }

    public UserVo getUserVo() {
        return userVo;
    }

    //构造方法
    /*public User(int id, String name) {
        this.id = id;
        this.name = name;
    }*/
}
