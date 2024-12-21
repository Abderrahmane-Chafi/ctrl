package org.sid.controle.dao.repositories;

import org.sid.controle.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    Optional<Car> getCarByModel(String model);
}
