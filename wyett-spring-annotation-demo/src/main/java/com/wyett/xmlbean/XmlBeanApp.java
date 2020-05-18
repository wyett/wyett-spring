package com.wyett.xmlbean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/18 18:35
 * @description: TODO
 */

public class XmlBeanApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("XmlBean.xml");
    }
}
