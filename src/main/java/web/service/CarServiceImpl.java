package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Nissan", "red", "123"));
        cars.add(new Car("Mersedes", "white", "345"));
        cars.add(new Car("Reno", "green", "678"));
        cars.add(new Car("Honda", "black", "999"));
        cars.add(new Car("Toyota", "blue", "111"));
    }

    @Override
    public List<Car> getCarList() {
        return cars;
    }

    @Override
    public List<Car> getCarList(int count) {
        return getCarList().stream().limit(count).toList();
    }
}

