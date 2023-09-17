package corejavatasks.practice6;

public abstract class Abstract {
    public Abstract() {
        System.out.println("This is constructor of abstract class");
    }

    public abstract String a_method();

    public String normalMethod() {
        return "This is a normal method of abstract class";
    }
}

class SubClass extends Abstract {

    @Override
    public String a_method() {
        return "This is abstract method overridden";
    }
}

class B {
    public static void main(String[] args) {
        Abstract s = new SubClass();
        System.out.println(s.a_method());
        System.out.println(s.normalMethod());
    }
}
