package com.wyett.bean6lifecycle.component;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 9:51
 * @description: TODO
 */

public class Car {
    public Car() {
        System.out.println("Car constructor");
    }

    public void init() {
        System.out.println("Car initilized");
    }

    public void destroy() {
        System.out.println("Car destroy");
    }
}
