package com.springbroker.demo.config;


import com.springbroker.demo.config.interceptor.MybatisSqlInterceptor;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*@Configuration*/
public class MybatisConfig {
   /* @Bean
   public ConfigurationCustomizer mybatisConfigurationCustomizer() {
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.addInterceptor(new MybatisSqlInterceptor());
            }
        };
    }*/
}
