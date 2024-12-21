package service;

import org.sid.controle.dao.entities.Car;

public interface CarService {
    Car getCarByModel(String model);
    Car saveCar(Car carRequest);
}
