package service;

import org.sid.controle.dao.entities.Car;
import org.sid.controle.dao.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarManager implements CarService{
    @Autowired
    private CarRepository carRepository;
    @Override
    public Car getCarByModel(String model) {
        return carRepository.getCarByModel(model).orElse(null);
    }

    @Override
    public Car saveCar(Car carRequest) {
        return carRepository.save(carRequest);
    }
}
