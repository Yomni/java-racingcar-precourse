package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.time.temporal.ValueRange;

import static org.assertj.core.api.Assertions.assertThat;

public class MoveNumberTest {

    @Test
    void name() {
        int moveNumberRandomly = new MoveNumber().getMoveNumber();
        ValueRange boundary = ValueRange.of(0, 9);

        assertThat(boundary.isValidIntValue(moveNumberRandomly)).isTrue();
    }
}
