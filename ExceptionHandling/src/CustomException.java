public class CustomException extends Exception {

    String message;
    exceptionType eType;

    CustomException(String message, exceptionType eType) {
        this.message = message;
        this.eType = eType;
    }

    enum exceptionType {
        UNDERAGE;
    }
}
