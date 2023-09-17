package corejavatasks.practice6;

public abstract class Parent {
    public abstract void message();
}

class First extends Parent {
    @Override
    public void message() {
        System.out.println("This is first subclass");
    }
}

class Second extends Parent {
    @Override
    public void message() {
        System.out.println("This is second subclass");
    }
}

class Test {
    public static void main(String[] args) {
        Parent f = new First();
        f.message();
        Parent s = new Second();
        s.message();

    }

}

