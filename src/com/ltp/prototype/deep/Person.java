package com.ltp.prototype.deep;

import lombok.*;

import java.io.Serializable;


//此时不能使用Lombok的@Data注解，因为@Data会重写equals方法，hashCode方法导致深拷贝失效
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Cloneable, Serializable {
    private String name;
    private int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
