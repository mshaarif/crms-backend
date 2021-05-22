package com.tse.crms.service;

import java.util.List;

import com.tse.crms.dto.Car;

public interface CarService {
    public List<Car> getCars();
    public Car addCar(Car car);
}
