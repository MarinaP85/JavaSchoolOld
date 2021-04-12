package com.cber.lesson2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class HomeWork2 {
    public static void main(String[] args) {

        //Задание 1
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Лада", "седан"));
        cars.add(new Car("Лада", "хэтчбек"));
        cars.add(new Car("Мерседес", "седан"));
        cars.add(new Car("БМВ", "кроссовер"));
        cars.add(new Car("Форд", "хэтчбек"));
        cars.add(new Car("Пежо", "кроссовер"));
        cars.add(new Car("Тойота", "седан"));

        Map<String, List<Car>> carsByType = cars.stream().collect(groupingBy(Car::getType, HashMap::new, toList()));
        System.out.println(carsByType);

    }
}
