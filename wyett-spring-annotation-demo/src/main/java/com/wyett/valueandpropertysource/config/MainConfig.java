package com.wyett.valueandpropertysource.config;

import com.wyett.valueandpropertysource.component.DbConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 11:13
 * @description: TODO
 */

@Configuration
@PropertySource(value = "classpath:my.properties")
public class MainConfig {

    @Bean
    public DbConnection dbConnection() {
        return new DbConnection();
    }
}
