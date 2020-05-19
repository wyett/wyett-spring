package com.wyett.bean3componentscan.config;

import com.wyett.bean3componentscan.typefilter.WyettTypeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 10:39
 * @description: @ComponentScan包扫描
 */

/**
 * @ComponentScan
 */
@Configuration
@ComponentScan(basePackages = {"com.wyett.bean3componentscan"}, includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM, value = {WyettTypeFilter.class})
}, useDefaultFilters = false)
public class MainConfig4 {
}
