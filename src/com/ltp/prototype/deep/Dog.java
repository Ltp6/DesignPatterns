package com.ltp.prototype.deep;


import lombok.Getter;
import lombok.Setter;

import java.io.*;

//此时不能使用Lombok的@Data注解，因为@Data会重写equals方法，hashCode方法导致深拷贝失效
@Getter
@Setter
public class Dog implements Cloneable, Serializable {
    private String name;
    private Person p;

    //深拷贝实现方式1 ，不能使用lombok，否则会出现深拷贝失败
    @Override
    protected Dog clone() throws CloneNotSupportedException {
        //对引用变量属性单独处理
        Dog dog = (Dog) super.clone();
        dog.p = (Person) p.clone();
        return dog;
    }

    //深拷贝方式2
    public Dog deepCopy() {
        //字节数组输出流
        ByteArrayOutputStream byteArrayOutputStream = null;
        //对象输出流
        ObjectOutputStream objectOutputStream = null;
        //字节数字输入流
        ByteArrayInputStream byteArrayInputStream = null;
        //对象输入流
        ObjectInputStream objectInputStream = null;
        Dog dog = null;
        try {
            //对象序列化
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            //将当前对象以流的形式输出
            objectOutputStream.writeObject(this);
            //反序列化
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            dog = (Dog) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return dog;
    }
}
