package corejavatasks.practice8;

public class Check {
    public static void main(String[] args) {
        System.out.println(check(5));
    }

    public static Object check(int a) {
        if (a > 0) {
            return a;
        }
        return new ErrorResponse(400, "Number is negative");
    }
}

class ErrorResponse {
    private Integer status;
    private String text;

    public ErrorResponse(Integer status, String text) {

        this.status = status;
        this.text = text;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "status=" + status +
                ", text='" + text + '\'' +
                '}';
    }
}

class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}

