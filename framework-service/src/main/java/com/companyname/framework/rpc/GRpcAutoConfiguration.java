package com.companyname.framework.rpc;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GRpcServerProperties.class)
public class GRpcAutoConfiguration {

    @Bean
    @ConditionalOnBean(annotation = GRpcService.class)
    public GRpcServerRunner gRpcServerRunner(){
        return new GRpcServerRunner();
    }

}
