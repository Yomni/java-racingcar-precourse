package racingcar.domain;

public class RacingCar {
    private final RacingCarName racingCarName;
    private final Location location;

    public RacingCar(String racingCarName) {
        this.racingCarName = new RacingCarName(racingCarName);
        this.location = new Location();
    }

    public void race(int no) {
        if (location.isForward(no)) {
            location.forward();
        }
    }

    public int getLocation() {
        return this.location.getLocation();
    }

    public String getRacingCarName() {
        return this.racingCarName.getRacingCarName();
    }
}
