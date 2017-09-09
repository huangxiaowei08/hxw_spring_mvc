package cn.com.hxw.study.entity;

/**
 * Created by huangxiaowei on 17/9/9.
 */
public class User {
    private int id;
    private String name;
    private int age;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "user[id="+id+",name="+name+",age="+age+"]";
    }
}
