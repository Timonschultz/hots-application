package nl.timonschultz.hots.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "nl")
@EntityScan("nl.*")
@EnableJpaRepositories("nl.*")
public class HotsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotsApplication.class, args);
    }
}