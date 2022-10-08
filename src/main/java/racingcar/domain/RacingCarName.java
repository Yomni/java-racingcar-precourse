package racingcar.domain;

import org.junit.platform.commons.util.StringUtils;

public class RacingCarName {
    public static final String ERROR_MSG_OVER_LENGTH_LIMIT = "[ERROR] 자동차 이름은 5자 이하입니다.";
    public static final String ERROR_MSG_BLANK_OR_NULL = "[ERROR] 자동차 이름이 공백입니다.";
    public static final int MAX_LENGTH_LIMIT_OF_RACING_CAR_NAME = 5;

    private final String racingCarName;

    public RacingCarName(String racingCarName) {
        validName(racingCarName);
        this.racingCarName = racingCarName;
    }

    private void validName(String racingCarName) {
        validBlankOrNull(racingCarName);
        validNameLength(racingCarName);
    }

    private void validBlankOrNull(String racingCarName) {
        if (StringUtils.isBlank(racingCarName) || racingCarName == null) {
            throw new IllegalArgumentException(ERROR_MSG_BLANK_OR_NULL);
        }
    }

    private void validNameLength(String racingCarName) {
        if (racingCarName.length() > MAX_LENGTH_LIMIT_OF_RACING_CAR_NAME) {
            throw new IllegalArgumentException(ERROR_MSG_OVER_LENGTH_LIMIT);
        }
    }

    public String getRacingCarName() {
        return this.racingCarName;
    }
}
