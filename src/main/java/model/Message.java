package model;

public enum Message {
    INVALID_INPUT("입력이 잘못되었습니다"),
    NUMBER_INPUT_EXCEPTION("숫자를 입력하세요"),
    CAR_INPUT_GUIDE("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    LAP_INPUT_GUIDE("시도할 횟수는 몇회인가요?"),
    WINNER_ANNOUNCE("가 우승했습니다.");

    private final String message;
    Message(String msg) {
        this.message = msg;
    }
    public String getMessage() {
        return message;
    }


}
