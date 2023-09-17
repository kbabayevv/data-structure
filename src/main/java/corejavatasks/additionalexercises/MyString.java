package corejavatasks.additionalexercises;

public class MyString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }

    public boolean isHexadecimalChar(char ch) {
        return (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F');
    }

    public boolean isHexadecimal() {
        if (str == null || str.isEmpty()) {
            return false;
        }

        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if (!isHexadecimalChar(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MyString hexString1 = new MyString("123F");
        System.out.println(hexString1.isHexadecimal()); // Output: true

        MyString hexString2 = new MyString("A23g");
        System.out.println(hexString2.isHexadecimal()); // Output: false
    }
}