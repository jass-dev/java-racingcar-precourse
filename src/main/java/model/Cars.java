package model;

import util.ValidationUtil;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final static String SPLIT_STRING = ",";
    private List<Car> carList;

    public Cars(String carsInput) {
        this.carList = createCarList(splitCars(carsInput));

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

    public void carsRaceProceed() {
        for (Car car : getCarList()) {
            car.carGoForward(ValidationUtil.carGoOrStop());
        }
    }

    public int getMaxDist() {
        int max = 0;
        for (Car car : getCarList()) {
            max = Math.max( car.getRaceDist() ,max);
        }
        return max;
    }

    public List<Car> getWinner() {
        List<Car> tempCarList = new ArrayList<>();
        int max = getMaxDist();
        for (Car car : getCarList()) {
            car.winnerListAdd(max, tempCarList);
        }
        return tempCarList;
    }
}
