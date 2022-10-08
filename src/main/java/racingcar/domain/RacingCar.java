package racingcar.domain;

public class RacingCar {

    private int location;

    public void race(int no) {
        if (no >= 4) {
            this.location++;
        }
    }

    public int getLocation() {
        return this.location;
    }
}
