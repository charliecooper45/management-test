package uk.cooperca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!test")
public class CommandConfig {

    @Bean
    public Runtime runtime() {
        return Runtime.getRuntime();
    }
}
