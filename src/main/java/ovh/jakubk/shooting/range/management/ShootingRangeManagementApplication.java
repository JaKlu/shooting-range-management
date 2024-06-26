package ovh.jakubk.shooting.range.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("ovh.jakubk.shooting.range.management.database.dao.springdata")
public class ShootingRangeManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShootingRangeManagementApplication.class, args);
    }
}
