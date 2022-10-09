package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarsTest {
    @Test
    void 프로그램_실행결과_예시_테스트() {
        RacingCar pobi = new RacingCar(new RacingCarName("pobi"));
        RacingCar crong = new RacingCar(new RacingCarName("crong"));
        RacingCar honux = new RacingCar(new RacingCarName("honux"));

        pobi.race(new MoveNumberForTest(4));
        crong.race(new MoveNumberForTest(2));
        honux.race(new MoveNumberForTest(4));

        pobi.race(new MoveNumberForTest(5));
        crong.race(new MoveNumberForTest(5));
        honux.race(new MoveNumberForTest(5));

        pobi.race(new MoveNumberForTest(5));
        crong.race(new MoveNumberForTest(5));
        honux.race(new MoveNumberForTest(5));

        pobi.race(new MoveNumberForTest(5));
        crong.race(new MoveNumberForTest(5));
        honux.race(new MoveNumberForTest(5));

        pobi.race(new MoveNumberForTest(5));
        crong.race(new MoveNumberForTest(5));
        honux.race(new MoveNumberForTest(5));

        List<RacingCar> newCars = new ArrayList<>();
        newCars.add(pobi);
        newCars.add(crong);
        newCars.add(honux);

        RacingCars carList = new RacingCars(newCars);
        Winners result = carList.report();

        String resultStr = result.getWinnersAsString();
        assertThat("pobi, honux").isEqualTo(resultStr);
    }
}
