package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, 1111, "Model_1"));
        cars.add(new Car(2, 2222, "Model_2"));
        cars.add(new Car(3, 3333, "Model_3"));
        cars.add(new Car(4, 4444, "Model_4"));
        cars.add(new Car(5, 5555, "Model_5"));

    }


    public List<Car> showLimitCar(int count) {

    return count > 0 ? (cars.stream().limit(count).collect(Collectors.toList())): null;
    }

}
