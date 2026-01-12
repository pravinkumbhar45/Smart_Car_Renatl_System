package com.smartcarrental.service;

import com.smartcarrental.entity.Car;
import java.util.List;

public interface CarService {

    Car addCar(Car car);

    List<Car> getAllCars();

    Car getCarById(Long id);

    void deleteCar(Long id);
}
