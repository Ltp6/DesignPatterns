package com.ltp.combination.menu;

/**
 * @Description: TODO
 * @Author: Ltp
 * @Date: 2021/9/15 22:45
 */
public class MenuItem extends AbstractMenuComponent {


    public MenuItem(String name, Integer level) {
        super(name, level);
    }

    @Override
    public void print() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < level; i++) {
            builder.append("--");
        }
        System.out.println(builder + name);
    }
}
