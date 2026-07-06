package id.ac.ui.cs.advprog.niuproject.service;
import id.ac.ui.cs.advprog.niuproject.model.Car;
import id.ac.ui.cs.advprog.niuproject.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarRepository carRepository;
    @Override
    public Car create(Car car){
        carRepository.create(car);
        return car;
    }

    @Override
    public List<Car> findAll() {
        Iterator<Car> carIterator = carRepository.findAll();
        List<Car> allCar = new ArrayList<>();
        carIterator.forEachRemaining(allCar::add);
        return allCar;
    }

    @Override
    public Car findById(String carId){
        return carRepository.findById(carId);
    }

    @Override
    public Car edit(Car car) {
        return carRepository.edit(car);
    }

    @Override
    public void deleteCarById(String carId) {
        Car car = carRepository.findById(carId);
        if (car != null) {
            carRepository.delete(car);
        }
    }
}