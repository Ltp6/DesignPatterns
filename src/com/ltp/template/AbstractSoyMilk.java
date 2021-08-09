package com.ltp.template;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/9 23:44
 */
public abstract class AbstractSoyMilk {

    /**
     * 豆浆制作模板方法
     */
    public final void make(){
        select();
        if(isIngredients()){
            ingredients();
        }
        soak();
        beat();
    }

    /**
     * 材料选择
     */
    public void select(){
        System.out.println("第一步：选取新鲜的黄豆");
    }

    /**
     * 配料
     */
    protected abstract void ingredients();

    public void soak(){
        System.out.println("第三步:浸泡豆子");
    }

    public void beat(){
        System.out.println("第四步：打豆浆");
    }

    protected boolean isIngredients(){
        return true;
    }
}
