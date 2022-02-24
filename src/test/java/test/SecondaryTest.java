package test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import setup.PrimaryConfig;
import setup.SecondaryConfig;
import setup.SomeBean;

@SpringBootTest(classes = {
        SecondaryConfig.class,
        PrimaryConfig.class
})
public class SecondaryTest {

    @Autowired
    private SomeBean someBean;

    @Test
    public void test() {
        Assertions.assertThat(this.someBean).isNotNull();
    }

}
