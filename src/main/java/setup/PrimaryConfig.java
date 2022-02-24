package setup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrimaryConfig {

    @Bean
    public SomeBean someBean() {
        return new SomeBean();
    }

}
