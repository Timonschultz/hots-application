package nl.timonschultz.hots.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"nl.*"})
@SpringBootApplication
public class HotsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotsApplication.class, args);
    }
}
