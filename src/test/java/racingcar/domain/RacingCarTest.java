package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {
    private RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = new RacingCar("Tom");
    }

    @Test
    @DisplayName("전진 테스트")
    void 전진() {
        racingCar.race(4);
        int location = racingCar.getLocation();

        assertThat(location).isEqualTo(1);
    }

    @Test
    @DisplayName("멈춤 테스트")
    void 멈춤() {
        racingCar.race(0);
        int location = racingCar.getLocation();

        assertThat(location).isEqualTo(0);
    }

    @Test
    @DisplayName("자동차 이름 테스트")
    void 자동차이름() {
        String racingCarName = racingCar.getRacingCarName();

        assertThat("Tom").isEqualTo(racingCarName);
    }
}
