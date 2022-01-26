package ru.nposp.tech.cli.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
@Configuration
@ComponentScan("ru.nposp.tech.cli")
public class ConfigJson {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
