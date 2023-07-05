package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarSerice {
    private final List<Car> listCar;

    public CarServiceImpl() {
        listCar = new ArrayList<>();
        listCar.add(new Car("Toyota",        "Camry",   2020));
        listCar.add(new Car("Honda",         "Accord",  2019));
        listCar.add(new Car("BMW",           "X5",      2021));
        listCar.add(new Car("Mercedes-Benz", "E-Class", 2022));
        listCar.add(new Car("Audi",          "A4",      2020));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 0 && count <= listCar.size()) {
            return listCar.subList(0, count);
        }
        return listCar;
    }
}
