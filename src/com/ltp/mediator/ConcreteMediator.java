package com.ltp.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: James.Lee
 * @Date: 2021/8/15 23:16
 */
public class ConcreteMediator extends AbstractMediator {

    private final Map<String,AbstractColleague> colleagueMap;
    private final Map<String,String> internalMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>(16);
        this.internalMap = new HashMap<>(16);
    }

    @Override
    protected void setMessage(int stateChange, String name) {

        if (colleagueMap.get(name) instanceof Alarm){
            if(stateChange==0){
                ((Tv)colleagueMap.get(internalMap.get("Tv"))).start();
            }else if(stateChange==1){
                ((Tv)colleagueMap.get(internalMap.get("Tv"))).stop();
            }
        }

    }

    @Override
    protected void register(String name, AbstractColleague abstractColleague) {
        colleagueMap.put(name,abstractColleague);
        String simpleName = abstractColleague.getClass().getSimpleName();
        internalMap.put(simpleName,name);
    }

}
