package com.ltp.prototype.shallow;

//浅拷贝
public class PrototypeDemo {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("jugg", "白色", 23);
        sheep.setFriend(new Sheep("med", "黑色", 23));
        Sheep sheep1 = sheep.clone();
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        sheep3.getFriend().setName("dp");
        Sheep sheep4 = sheep.clone();
        System.out.println(sheep1+"\t"+sheep1.getFriend().getName());
        System.out.println(sheep2.hashCode()+"\t"+sheep2.getFriend().getName());
        System.out.println(sheep3.hashCode()+"\t"+sheep3.getFriend().getName());
        System.out.println(sheep4.hashCode()+"\t"+sheep4.getFriend().getName());


    }
}
