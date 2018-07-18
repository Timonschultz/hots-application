package nl.timonschultz.hots.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan(basePackages = {"nl.timonschultz.hots.api", "nl.timonschultz.hots.core", "nl.timonschultz.hots.boot", "nl.timonschultz.hots.persistence"})
@EntityScan("nl.*")
public class HotsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotsApplication.class, args);
    }
}
