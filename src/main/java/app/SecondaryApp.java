package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import setup.PrimaryConfig;
import setup.SecondaryConfig;
import setup.SomeBean;

@SpringBootApplication
@Import({
        SecondaryConfig.class,
        PrimaryConfig.class
})
public class SecondaryApp {

    @Autowired
    private SomeBean someBean;

    public static void main(String[] args) {
        SpringApplication.run(SecondaryApp.class, args);
    }

}
