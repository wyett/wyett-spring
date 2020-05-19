package com.wyett.bean5factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 18:42
 * @description: TODO
 */

public class DogFactoryBean implements FactoryBean<Dog> {
    @Override
    public Dog getObject() throws Exception {
        return new Dog();
    }

    @Override
    public Class<?> getObjectType() {
        return Dog.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
