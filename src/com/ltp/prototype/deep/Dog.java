package com.ltp.prototype.deep;


import java.io.*;

/**
 * @description 此时不能使用Lombok的@Data注解，因为@Data会重写equals方法，hashCode方法导致深拷贝失效
 * @author admin
 */
public class Dog implements Cloneable, Serializable {
    private String name;
    private Person p;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    /**
     * 深拷贝实现方式1 ，不能使用lombok，否则会出现深拷贝失败
     * @return dog对象
     * @throws CloneNotSupportedException
     */
    @Override
    protected Dog clone() throws CloneNotSupportedException {
        //对引用变量属性单独处理
        Dog dog = (Dog) super.clone();
        dog.p = (Person) p.clone();
        return dog;
    }

    /**
     * 通过序列化进行深拷贝
     * @return dog对象
     */
    public Dog deepCopy() {
        Dog dog = null;
        try (
                //字节数组输出流
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                //对象输出流
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        ) {
            //输出对象
            objectOutputStream.writeObject(this);
            try (
                    //字节数字输入流
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    //对象输入流
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)
            ) {
                //输入对象
                dog = (Dog) objectInputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return dog;
    }
}
