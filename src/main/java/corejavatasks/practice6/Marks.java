package corejavatasks.practice6;

public abstract class Marks {
    public abstract Double getPercentage();
}

class A extends Marks {
    private Double Math;
    private Double Chemistry;
    private Double Physic;

    public A(Double Math, Double Chemistry, Double Physic) {
        this.Math = Math;
        this.Chemistry = Chemistry;
        this.Physic = Physic;

    }

    @Override
    public Double getPercentage() {
        return (Math + Chemistry + Physic) / 3.0;
    }
}

class B1 extends Marks {
    private Double History;
    private Double English;
    private Double Biology;
    private Double Geography;

    public B1(Double History, Double English, Double Biology, Double Geography) {
        this.History = History;
        this.English = English;
        this.Biology = Biology;
        this.Geography = Geography;

    }

    @Override
    public Double getPercentage() {
        return (History + English + Biology + Geography) / 4.0;
    }
}

class C {
    public static void main(String[] args) {
        Marks aStudent = new A(96.3, 85.12, 59.45);
        System.out.println(aStudent.getPercentage());
        Marks bStudent = new B1(63.95, 85.32, 96.00, 74.13);
        System.out.println(bStudent.getPercentage());
    }
}
