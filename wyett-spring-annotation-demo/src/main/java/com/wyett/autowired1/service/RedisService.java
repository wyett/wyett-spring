package com.wyett.autowired1.service;

import com.wyett.autowired1.dao.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 12:17
 * @description: 自动装配
 */

@Service
public class RedisService {

    /**
     * 首先按照类型来装配，如果有多个类型相同的组件，则按照名称来装配；
     */
    @Autowired
    private RedisDao redisDao;

    /**
     * @Qualifier注解指定注入的组件名称
     */
    @Autowired
    @Qualifier("redisDao")
    private RedisDao redisDao2;

    /**
     * IOC容器中没有redisDao3，也没有redisDao4
     * 产生报错： No qualifying bean of type 'com.wyett.autowireddemo.dao.RedisDao' 没有可用的RedisDao类型的Bean
     * 在Autowired中添加required = false，不强制检查消除错误
     */
    @Autowired(required = false)
    @Qualifier("redisDao3")
    private RedisDao redisDao4;
}
