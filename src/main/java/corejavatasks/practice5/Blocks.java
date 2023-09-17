package corejavatasks.practice5;

public class Blocks {
    public Blocks() {
        System.out.println("No args Constructor has ran");
    }

    static {
        System.out.println("Static blocks has ran");
    }

    {
        System.out.println("Instance blocks has ran");
    }


    public static void main(String[] args) {
        Blocks b = new Blocks();
    }
}
