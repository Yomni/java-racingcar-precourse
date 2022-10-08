package racingcar.domain;

import java.util.Objects;

public class RacingCar {
    private final RacingCarName racingCarName;
    private final Location location;

    public RacingCar(String racingCarName) {
        this.racingCarName = new RacingCarName(racingCarName);
        this.location = new Location();
    }

    public void race(MoveNumber moveNumber) {
        if (location.isForward(moveNumber.getMoveNumber())) {
            location.forward();
        }
    }

    public Location getLocation() {
        return this.location;
    }

    public RacingCarName getRacingCarName() {
        return this.racingCarName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingCar racingCar = (RacingCar) o;
        return Objects.equals(racingCarName, racingCar.racingCarName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(racingCarName, location);
    }
}
