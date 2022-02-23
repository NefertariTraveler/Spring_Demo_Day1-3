package com.javacto.day1.f_setter;

/**
 * liu
 **/
public class UserVo {
    private  int id2;
    private  String  name2;
    @Override
    public String toString() {
        return "UserVo{" +
                "id2=" + id2 +
                ", name2='" + name2 + '\'' +
                '}';
    }
    public void setId2(int id2) {
        this.id2 = id2;
    }
    public void setName2(String name2) {
        this.name2 = name2;
    }
}
