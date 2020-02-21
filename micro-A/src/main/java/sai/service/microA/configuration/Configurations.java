package sai.service.microA.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Configurations {

    @Bean
    @LoadBalanced
    public RestTemplate getRESTTemplate(){
        return new RestTemplate();
    }
}

