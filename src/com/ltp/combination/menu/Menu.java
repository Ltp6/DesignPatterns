package com.ltp.combination.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: Ltp
 * @Date: 2021/9/15 22:42
 */
public class Menu extends AbstractMenuComponent {

    private final List<AbstractMenuComponent> list;

    public Menu(String name, Integer level) {
        super(name, level);
        list = new ArrayList<>();
    }

    @Override
    public void add(AbstractMenuComponent abstractMenuComponent) {
        list.add(abstractMenuComponent);
    }

    @Override
    public void remove(AbstractMenuComponent menuComponent) {
        list.remove(menuComponent);
    }

    @Override
    public void print() {
        //打印菜单名称
        for(int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);

        //打印子菜单或者子菜单项名称
        for (AbstractMenuComponent component : list) {
            component.print();
        }
    }
}
