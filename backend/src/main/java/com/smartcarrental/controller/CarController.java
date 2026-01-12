package com.smartcarrental.controller;

import com.smartcarrental.entity.Car;
import com.smartcarrental.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@CrossOrigin
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return carService.addCar(car);
    }

    @GetMapping
    public List<Car> getCars() {
        return carService.getAllCars();
    }
}
