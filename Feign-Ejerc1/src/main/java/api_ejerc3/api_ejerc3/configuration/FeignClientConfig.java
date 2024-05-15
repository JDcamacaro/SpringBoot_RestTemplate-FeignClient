package api_ejerc3.api_ejerc3.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.Logger.Level;

@Configuration
public class FeignClientConfig {

    @Bean
    Level feignLoggerLevel() {
        return feign.Logger.Level.FULL;

    }

}
