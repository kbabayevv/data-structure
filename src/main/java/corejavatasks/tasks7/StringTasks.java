package corejavatasks.tasks7;

class Task1 {
    public static void main(String[] args) {
        String s = "Java Exercises!";
        System.out.println(s.charAt(0));
    }
}

class Task2 {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "JAVA";
        System.out.println(s1.compareToIgnoreCase(s2));
    }
}

class Task3 {
    public static void main(String[] args) {
        String s = "Java";
        String s1 = " Programming";
        System.out.println(s.concat(s1));
    }
}

class Task4 {
    public static void main(String[] args) {
        String s = "Hello World!";
        System.out.println(s.contains("or"));
    }
}

class Task5 {
    public static void main(String[] args) {
        char[] arr_num = new char[]{'1', '2', '3', '4'};
        String page_num = "";
        for (int i = 1; i < arr_num.length; i++) {
            page_num += arr_num[i];
        }
        System.out.println("The book contains " + page_num + " pages");
    }
}

class Task6 {
    public static void main(String[] args) {
        String s = "Java Language";
        String s1 = "Java Programming";
        System.out.println(s.equals(s1));
    }

}
