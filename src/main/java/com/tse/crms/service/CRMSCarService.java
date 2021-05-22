package com.tse.crms.service;

import java.util.ArrayList;
import java.util.List;

import com.tse.crms.dto.Car;
import com.tse.crms.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CRMSCarService implements CarService{

    @Autowired
    CarRepository repository;

    @Override
    public List<Car> getCars() {
        return (List<Car>) repository.findAll();
    }

    @Override
    public Car addCar(Car car) {
        return repository.save(car);
    }
    
}
