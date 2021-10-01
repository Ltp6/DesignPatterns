package com.ltp.memo.white;

/**
 * @Description: 角色状态管理者类
 * @Author: James.Lee
 * @Date: 2021/10/1 23:48
 */
public class RoleStateCaretaker {

    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
