package com.lupan.javaStudy.chapter18.dynamicProxy;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/4/7 0007
 */
public class Main {
    public static void main(String[] args){
        Dog dog = new RunDog();
        Dog dogProxy = (Dog)MyProxyFactory.getProxy(dog);
        dog.info();
        dog.run();
        dogProxy.info();
        dogProxy.run();
    }
}
