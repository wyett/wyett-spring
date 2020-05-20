package com.wyett.autowired1.config;

import com.wyett.autowired1.dao.RedisDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 12:07
 * @description: TODO
 */

@Configuration
@ComponentScan(value = "com.wyett.autowired1")
public class MainConfig {

    @Bean
    public RedisDao redisDao() {
        return new RedisDao();
    }

    @Primary
    @Bean
    public RedisDao redisDao5() {
        return new RedisDao();
    }
}
