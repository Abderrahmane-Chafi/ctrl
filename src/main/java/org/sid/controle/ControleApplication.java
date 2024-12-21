package org.sid.controle;

import org.sid.controle.dao.entities.Car;
import org.sid.controle.dao.repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CarRepository carRepository) {
        return args -> {
            List<Car> avions = List.of(
                    Car.builder().model("Dacia1").color("orange").matricul("ABC223").price(4989898).build(),
                    Car.builder().model("Dacia2").color("black").matricul("wfu3224").price(11000).build(),
                    Car.builder().model("Dacia3").color("yellow").matricul("fiwueiu32").price(5000).build(),
                    Car.builder().model("Dacia4").color("red").matricul("ncjwij3").price(4387).build()
            );
            carRepository.saveAll(avions);

        };
    }
}
