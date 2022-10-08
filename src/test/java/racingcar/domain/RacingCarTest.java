package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
    @DisplayName("전진 값이 잘못 입력된 경우 테스트")
    void 입력_예외() {
        RacingCar racingCar = new RacingCar("Yomni");

        assertThatThrownBy(() -> racingCar.race(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(Location.ERROR_MSG_WRONG_NO);
        assertThatThrownBy(() -> racingCar.race(10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(Location.ERROR_MSG_WRONG_NO);
    }

    @Test
    @DisplayName("자동차 이름 테스트")
    void 자동차이름() {
        String racingCarName = racingCar.getRacingCarName();

        assertThat("Tom").isEqualTo(racingCarName);
    }

    @Test
    @DisplayName("자동차 이름을 6자 테스트")
    void 자동차이름_길이_예외_테스트() {
        assertThatThrownBy(() -> new RacingCar("stupid"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(RacingCarName.ERROR_MSG_OVER_LENGTH_LIMIT);
    }

    @Test
    @DisplayName("자동차이름 null 혹은 공백 예외 테스트")
    void 자동차이름_공백_예외_테스트() {
        assertThatThrownBy(() -> new RacingCar(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(RacingCarName.ERROR_MSG_BLANK_OR_NULL);

        assertThatThrownBy(() -> new RacingCar(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(RacingCarName.ERROR_MSG_BLANK_OR_NULL);
    }
}
