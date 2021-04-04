package dafe.springframework.beerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class BeerServiceApplication {

    private static final Logger LOGGER = Logger.getLogger(BeerServiceApplication.class.getName());
    public static void main(String[] args) {
        SpringApplication.run(BeerServiceApplication.class, args);

        LOGGER.info("HEY DAFE, THE SYSTEM LAUNCHED SUCCESSFULLY...");
    }
}
