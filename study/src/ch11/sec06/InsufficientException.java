package ch11.sec06;

public class InsufficientException extends Exception {
    // 생성자 오버로딩
    public InsufficientException() {}
    public InsufficientException(String message) {
        super(message);
    }

}
