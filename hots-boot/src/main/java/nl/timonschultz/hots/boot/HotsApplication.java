package nl.timonschultz.hots.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"nl.*"})
@EntityScan("nl.*")
@EnableJpaRepositories("nl.*")
@SpringBootApplication
public class HotsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotsApplication.class, args);
    }
}
