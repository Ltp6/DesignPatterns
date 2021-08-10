package com.ltp.visitor;

import com.ltp.prototype.deep.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/11 0:00
 */
public class ObjectStructure {

    private List<AbstractPerson> list = new ArrayList<>();

    public void add(AbstractPerson p){
        list.add(p);
    }

    public void remove(AbstractPerson p){
        list.remove(p);
    }

    /**
     * 显示测评情况
     * @param action 测评
     */
    public void display(AbstractAction action){
        list.forEach(p-> p.accept(action));
    }
}
