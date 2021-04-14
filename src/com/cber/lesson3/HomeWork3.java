package com.cber.lesson3;

import java.util.HashMap;
import java.util.Map;

public class HomeWork3 {
    public static void main(String[] args) {
        MyCountMap<? super Integer> map = new MyCountMap<>();

        //добавляет элемент в этот контейнер
        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        //Возвращает количество добавлений данного элемента
        int count = map.getCount(5); // 2
        System.out.println("Count 5: " + count);
        count = map.getCount(6); // 1
        System.out.println("Count 6: " + count);
        count = map.getCount(10); // 3
        System.out.println("Count 10: " + count);

        //Удаляет элемент и контейнера и возвращает количество его добавлений(до удаления)
        count = map.remove(5);
        System.out.println("Remove 5: " + count);
        System.out.println("MyCountMap: ");
        map.printCountMap();

        //количество разных элементов
        count = map.size();
        System.out.println("Count all unique: " + count);

        //Добавить все элементы из source в текущий контейнер,
        //при совпадении ключей, суммировать значения
        MyCountMap<Integer> mapForAdd = new MyCountMap<>();
        mapForAdd.add(7);
        mapForAdd.add(1);
        mapForAdd.add(5);
        mapForAdd.add(1);

        map.addAll(mapForAdd);
        System.out.println("MyCountMap: ");
        map.printCountMap();

        //Вернуть java.util.Map. ключ - добавленный элемент,
        //значение - количество его добавлений
        Map<? super Integer, Integer> mapCopy = new HashMap<>();
        mapCopy = map.toMap();
        System.out.println("mapCopy: ");
        System.out.println(mapCopy);

        //всю информацию записать в destination
        map.toMap(mapCopy);
        System.out.println("mapCopy2: ");
        map.printCountMap();
        System.out.println(mapCopy);
    }
}
