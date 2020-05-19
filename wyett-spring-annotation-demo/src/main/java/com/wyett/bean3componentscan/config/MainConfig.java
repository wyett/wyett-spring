package com.wyett.bean3componentscan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 10:39
 * @description: @ComponentScan包扫描
 */

/**
 * @ComponentScan
 */
@Configuration
@ComponentScan(basePackages = {"com.wyett.bean3componentscan"})
public class MainConfig {
}
