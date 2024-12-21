package org.sid.controle.web;

import org.sid.controle.dao.entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.sid.controle.service.CarService;

@Controller
public class CarGraphQLController {
    @Autowired
    private CarService carService;

    @PostMapping("/getCarByModel")
    public ResponseEntity<Car> getCarByModel(@RequestParam String model) {
        Car car = carService.getCarByModel(model);
        return ResponseEntity.ok(car);
    }
    @PostMapping("/saveCar")
    public ResponseEntity<Car> saveCar(@RequestBody Car carRequest) {
        Car savedCar = carService.saveCar(carRequest);
        return ResponseEntity.ok(savedCar);
    }
}
