package emi.ac.ma.mongoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("emi.ac.ma.mongoproject.repositories")
public class MongoProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoProjectApplication.class, args);
    }

}
