package com.smartcarrental.service.impl;

import com.smartcarrental.entity.Car;
import com.smartcarrental.repository.CarRepository;
import com.smartcarrental.service.CarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car addCar(Car car) {
        car.setAvailable(true);
        return carRepository.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(Long id) {
        return carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found"));
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
