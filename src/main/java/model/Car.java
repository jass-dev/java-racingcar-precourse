package model;

import util.ValidationUtil;
import java.util.List;

public class Car {
    private static final int forwardInterval = 1;
    private final String name;
    private int raceDist;

    public Car(String name) {
        ValidationUtil.isCarNameValid(name);
        this.name = name;
    }

    public void carGoForward(boolean carGoOrStop) {
        if (carGoOrStop) {
            setRaceDist(getRaceDist() + forwardInterval);
        }
    }

    public void winnerListAdd(int max, List<Car> tempCarList) {
        if (getRaceDist() == max) {
            tempCarList.add(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getRaceDist() {
        return raceDist;
    }

    public void setRaceDist(int raceDist) {
        this.raceDist = raceDist;
    }
}
