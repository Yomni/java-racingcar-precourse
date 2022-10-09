package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
    private final List<RacingCar> racingCars;

    public RacingCars(List<RacingCar> newCars) {
        this.racingCars = newCars;
    }

    public void raceAll() {
        for (RacingCar car : racingCars) {
            car.race(new MoveNumber());
        }
    }

    public Winners report() {
        Location maxLocation = findMaxLocation();
        List<RacingCarName> winnerList = getWinnerList(maxLocation);
        return new Winners(winnerList);
    }

    private List<RacingCarName> getWinnerList(Location maxLocation) {
        List<RacingCarName> winnerList = new ArrayList<>();
        for (RacingCar car : racingCars) {
            addWinnerList(maxLocation, winnerList, car);
        }
        return winnerList;
    }

    private void addWinnerList(Location maxLocation, List<RacingCarName> winnerList, RacingCar car) {
        if (car.getLocation().equals(maxLocation)) {
            winnerList.add(car.getRacingCarName());
        }
    }

    private Location findMaxLocation() {
        Location maxLocation = new Location(Integer.MIN_VALUE);
        for (RacingCar car : racingCars) {
            int carLocationValue = car.getLocation().getLocationValue();
            int maxLocationValue = maxLocation.getLocationValue();
            maxLocation = new Location(Math.max(carLocationValue, maxLocationValue));
        }
        return maxLocation;
    }

    public List<RacingCar> getRacingCars() {
        List<RacingCar> copyList = new ArrayList<>();
        for (RacingCar car : racingCars) {
            copyList.add(RacingCar.copy(car));
        }
        return copyList;
    }
}
