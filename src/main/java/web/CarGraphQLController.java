package web;

import org.sid.controle.dao.entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CarService;

@RestController
@RequestMapping("/graphql")
public class CarGraphQLController {
    @Autowired
    private CarService carService;

    @PostMapping("/getCarByModel")
    public ResponseEntity<Car> getAvionByModel(@RequestParam String model) {
        Car car = carService.getCarByModel(model);
        return ResponseEntity.ok(car);
    }
    @PostMapping("/saveCar")
    public ResponseEntity<Car> saveAvion(@RequestBody Car carRequest) {
        Car savedCar = carService.saveCar(carRequest);
        return ResponseEntity.ok(savedCar);
    }
}
