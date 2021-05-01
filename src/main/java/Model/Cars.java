package Model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> carList;
    private final String SPLIT_STRING = ",";

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
