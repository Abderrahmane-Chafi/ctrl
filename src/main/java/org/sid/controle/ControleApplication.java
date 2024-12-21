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
                    Car.builder().model("test1").color("White").matricul("ABC123").price(4000).build(),
                    Car.builder().model("test2").color("green").matricul("XYZ456").price(2000).build(),
                    Car.builder().model("test3").color("Red").matricul("DEF789").price(900).build(),
                    Car.builder().model("test4").color("Black").matricul("GHI101").price(100).build()
            );
            carRepository.saveAll(avions);

        };
    }
}
