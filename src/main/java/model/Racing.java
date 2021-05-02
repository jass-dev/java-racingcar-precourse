package model;

import inout.InputOutputUtil;

import java.util.InputMismatchException;

public class Racing {
    private int racingLap;
    private Cars cars;

    public void playRace() {
        try {
            setRace();
            doRace();
            judgeWinner();
        } catch (InputMismatchException e) {
            InputOutputUtil.writeMessage(Message.NUMBER_INPUT_EXCEPTION);
        } catch (IllegalArgumentException e) {
            InputOutputUtil.writeMessage(Message.INVALID_INPUT);
        }
    }

    private void doRace() {
        for (int i = 0; i < getRacingLap(); i++) {
            cars.carsRaceProceed();
            InputOutputUtil.writeRaceProceed(cars.getCarList());
        }
    }

    public void setRace() {
        InputOutputUtil.writeMessage(Message.CAR_INPUT_GUIDE);
        cars = new Cars(InputOutputUtil.getCarsInput());
        InputOutputUtil.writeMessage(Message.LAP_INPUT_GUIDE);
        setRacingLap(InputOutputUtil.getLapInput());
    }

    public void judgeWinner() {
        InputOutputUtil.writeWinner(cars.getWinner());
    }

    public int getRacingLap() {
        return racingLap;
    }

    public void setRacingLap(int racingLap) {
        this.racingLap = racingLap;
    }

    public boolean isRacingEnded(int race) {
        return this.getRacingLap() <= race;
    }


}
