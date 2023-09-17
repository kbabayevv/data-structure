package corejavatasks.practice6;

public interface Bank {
    String getBalance();
}

class BankA implements Bank {

    @Override
    public String getBalance() {
        return "100$";
    }

}

class BankB implements Bank {

    @Override
    public String getBalance() {
        return "150$";
    }
}

class BankC implements Bank {

    @Override
    public String getBalance() {
        return "200$";
    }
}

class Tester {
    public static void main(String[] args) {
        Bank a = new BankA();
        System.out.println(a.getBalance());

        Bank b = new BankB();
        System.out.println(b.getBalance());

        Bank c = new BankC();
        System.out.println(c.getBalance());
    }
}
