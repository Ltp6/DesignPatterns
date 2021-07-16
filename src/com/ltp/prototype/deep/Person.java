package com.ltp.prototype.deep;

import lombok.*;

import java.io.Serializable;


/**
 * 此时不能使用Lombok的@Data注解，因为@Data会重写equals方法，hashCode方法导致深拷贝失效
 */

public class Person implements Cloneable, Serializable {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
