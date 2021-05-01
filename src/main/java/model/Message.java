package Model;

public enum Message {

    INVALID_INPUT("입력이 잘못되었습니다");

    private final String message;
    Message(String msg) {
        this.message = msg;
    }
    public String getMessage() {
        return message;
    }


}
