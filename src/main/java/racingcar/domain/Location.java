package racingcar.domain;

public class Location {
    public static final int MAX_FORWARD_LIMIT = 9;
    public static final int MIN_FORWARD_LIMIT = 4;
    public static final int MAX_STOP_LIMIT = 3;
    public static final int MIN_STOP_LIMIT = 0;
    public static final String ERROR_MSG_WRONG_NO = "[ERROR] 허용된 범위 밖의 값을 입력하였습니다. 0 ~ 9 의 값을 입력해주세요";

    private int location = 0;

    public boolean isForward(int no) {
        validNo(no);
        return no >= MIN_FORWARD_LIMIT && no <= MAX_FORWARD_LIMIT;
    }

    private void validNo(int no) {
        if (no > MAX_FORWARD_LIMIT || no < MIN_STOP_LIMIT) {
            throw new IllegalArgumentException(ERROR_MSG_WRONG_NO);
        }
    }
    public void forward() {
        this.location++;
    }

    public int getLocation() {
        return this.location;
    }
}
