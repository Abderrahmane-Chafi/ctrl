package org.sid.controle.mapper;

import org.sid.controle.dao.entities.Car;
import org.sid.controle.dto.CarDTO;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    public CarDTO toDto(Car car) {
        if (car == null) {
            return null;
        }

        CarDTO carDTO = new CarDTO();
        carDTO.setModel(car.getModel());
        carDTO.setColor(car.getColor());
        carDTO.setMatricul(car.getMatricul());
        carDTO.setPrice(car.getPrice());
        return carDTO;
    }
    public Car toEntity(CarDTO carDTO) {
        if (carDTO == null) {
            return null;
        }

        Car car = new Car();
        car.setModel(carDTO.getModel());
        car.setColor(carDTO.getColor());
        car.setMatricul(carDTO.getMatricul());
        car.setPrice(carDTO.getPrice());
        return car;
    }
}
