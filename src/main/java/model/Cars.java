package model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final static String SPLIT_STRING = ",";
    private List<Car> carList;

    public Cars(String carsInput) {
        try {
            this.carList = createCarList(splitCars(carsInput));
        } catch (IllegalArgumentException e) {
            System.out.println(Message.INVALID_INPUT.getMessage());
        }
    }

    private String[] splitCars(String carsInput) {
        return carsInput.split(SPLIT_STRING);
    }

    private List<Car> createCarList(String[] carsInputArray) {
        ArrayList<Car> tempCarList = new ArrayList<>();
        for (String carName : carsInputArray) {
            tempCarList.add(new Car(carName));
        }
        return tempCarList;
    }

    public List<Car> getCarList() {
        return carList;
    }

}
