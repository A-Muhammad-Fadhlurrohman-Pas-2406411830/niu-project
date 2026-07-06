package id.ac.ui.cs.advprog.niuproject.repository;

import id.ac.ui.cs.advprog.niuproject.model.Car;
import org.springframework.stereotype.Repository;

@Repository
public class CarRepository extends BaseRepository<Car> {

    @Override
    protected void updateSpecificFields(Car existing, Car updated) {
        existing.setColor(updated.getColor());
    }
}