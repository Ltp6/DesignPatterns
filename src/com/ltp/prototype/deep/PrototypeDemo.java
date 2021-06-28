package com.ltp.prototype.deep;

//深拷贝
public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog = new Dog();
        dog.setName("med");
        dog.setP(new Person("ltp", 22));
        //深拷贝方式1
        Dog dog2 = dog.clone();
        //深拷贝方式2
//        Dog dog2=dog.deepCopy();
        System.out.println(dog.equals(dog2));
        System.out.println(dog.getP().hashCode() + "\t" + dog2.getP().hashCode());
    }
}
