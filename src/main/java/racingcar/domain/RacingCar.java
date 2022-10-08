package racingcar.domain;

public class RacingCar {
    private final String racingCarName;
    private int location;

    public RacingCar(String racingCarName) {
        this.racingCarName = racingCarName;
    }

    public void race(int no) {
        if (no >= 4) {
            this.location++;
        }
    }

    public int getLocation() {
        return this.location;
    }

    public String getRacingCarName() {
        return this.racingCarName;
    }
}
