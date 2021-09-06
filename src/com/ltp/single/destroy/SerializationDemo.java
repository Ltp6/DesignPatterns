package com.ltp.single.destroy;

import com.ltp.single.Demo5;

import java.io.*;
import java.util.Objects;

/**
 * @Description: 序列化破坏单例
 * @Author: James.Lee
 * @Date: 2021/9/6 18:04
 */
public class SerializationDemo {

    public static void main(String[] args) {
        //懒汉式(线程安全双重检锁)
        var instance = Demo5.getInstance();
        var outputStream = write(instance);
        if(Objects.nonNull(outputStream)){
            var instance1 = read(outputStream);
            var instance2 = read(outputStream);
            System.out.println(instance1 == instance2);
            System.out.println(instance1);
            System.out.println(instance);
        }
    }

    /**
     * 序列化写对象
     * @param demo5 需要写出的对象
     * @return 字节数组输出流
     */
    private static ByteArrayOutputStream write(Demo5 demo5) {
        try ( //字节数组输出流
              ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
              //对象输出流
              ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);) {
            objectOutputStream.writeObject(demo5);
            return byteArrayOutputStream;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 序列化读对象
     * @param outputStream 字节数组输出流
     * @return 对象
     */
    private static Demo5 read(ByteArrayOutputStream outputStream) {
        try (  //字节数字输入流
               ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(outputStream.toByteArray());
               //对象输入流
               ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        ) {
            //输入对象
            return (Demo5) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }



}
