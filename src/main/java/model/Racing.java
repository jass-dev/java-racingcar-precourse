package model;

public class Racing {

    private int racingLap;

    public void playRace() {

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
