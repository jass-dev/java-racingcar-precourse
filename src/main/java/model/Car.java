package Model;

import util.ValidationUtil;

public class Car {
    private String name;

    public Car(String name) {
        ValidationUtil.isCarNameValid(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
