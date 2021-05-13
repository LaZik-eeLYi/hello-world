package com.lupan.HeadFirstDesignMode.chapter8_template;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/3/24 0024
 */
public abstract class CaffeineBeverage {

    /**
     * 模板方法
     */
    public void prepareRecipe(){
        System.out.println("准备咖啡因饮料。。。");
        boilWater();
        pureInCup();
        brew();
        //判断钩子
        if(wantsCondiments()){
            addCondiments();
        }
    }

    private void boilWater(){
        System.out.println("烧开水。。。");
    }

    private void pureInCup(){
        System.out.println("开水倒入杯子中。。。");
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    /**
     * 钩子方法
     * @return 默认为真
     */
    protected boolean wantsCondiments(){
        return true;
    }
}
