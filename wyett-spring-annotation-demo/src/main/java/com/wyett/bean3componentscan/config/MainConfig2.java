package com.wyett.bean3componentscan.config;

import com.wyett.bean3componentscan.service.WyettService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 10:39
 * @description: @ComponentScan包扫描
 */

/**
 * @ComponentScan
 */
@Configuration
@ComponentScan(basePackages = {"com.wyett.bean3componentscan"}, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class}),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {WyettService.class})
})
public class MainConfig2 {
}
