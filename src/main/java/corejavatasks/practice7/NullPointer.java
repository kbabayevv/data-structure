package corejavatasks.practice7;

public class NullPointer {
    public static void main(String[] args) {
        System.out.println(getValue(null));

    }


    public static Character getValue(String word) {
        try {
            return word.charAt(10);
        } finally {
            throw new NullMessageException("You can't send null reference");
        }
    }
}

class NullMessageException extends RuntimeException {
    public NullMessageException(String message) {
        super(message);
    }
}
