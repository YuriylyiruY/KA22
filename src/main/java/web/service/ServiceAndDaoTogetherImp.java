package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class ServiceAndDaoTogetherImp implements ServiceAndDaoTogether{

    List<String> listCars1 = new ArrayList<>();

    public List<String> getListCars1()  {
        listCars1.add(String.valueOf(new Car("red1", "V161", "MB1")));
        listCars1.add(String.valueOf(new Car("green1", "V161", "W1")));
        listCars1.add(String.valueOf(new Car("black1", "V321", "Porsche1")));
        listCars1.add(String.valueOf(new Car("white1", "V161", "BMW1")));
        listCars1.add(String.valueOf(new Car("purple1", "V161", "AUDI1")));
        return listCars1;
    }



    public List<String> checkQuantity(Integer quantity,List<String> listCars1) {
        List<String> listCars2 = new ArrayList<>();

        if (quantity <= 0 || quantity > 5) {
            System.out.println("GGGGGGGGG");
            IntStream.range(0, 5).forEachOrdered(i ->
                    listCars2.add(listCars1.get(i)));
            return listCars2;


        } else {
            IntStream.range(0, quantity).forEachOrdered(i ->
                    listCars2.add(listCars1.get(i)));
        }
        return listCars2;

    }
}
