package Model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> carList;

    public Cars(String carsInput) {
        this.carList = createCarList(splitCars(carsInput));
    }

    private String[] splitCars(String carsInput) {
        return carsInput.split(",");
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
