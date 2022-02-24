package setup;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecondaryConfig {

    @ConditionalOnMissingBean
    @Bean
    public SomeBean someBean() {
        return new SomeBean();
    }

}
