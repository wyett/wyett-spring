package com.wyett.bean6lifecycle.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 10:51
 * @description: 通过BeanPostProcessor拦截所有Bean的创建
 */

@Component
public class WyettBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("WyettBeanPostProcessor...postProcessBeforeInitialization" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("WyettBeanPostProcessor...postProcessAfterInitialization" + s);
        return o;
    }
}
