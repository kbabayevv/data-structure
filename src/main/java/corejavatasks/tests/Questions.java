package corejavatasks.tests;

public class Questions {
    public static void main(String[] args) {

    }
}

class TestClass {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0, j = 10; sum > 20; ++i, --j) {
            sum = sum + i + j;
        }
        System.out.println("Sum = " + sum);//Sum = 0
    }
}

class Holder {
    int value = 1;
    Holder link;

    public Holder(int val) {
        this.value = val;
    }

    public static void main(String[] args) {
        final Holder a = new Holder(5);
        Holder b = new Holder(10);
        a.link = b;
        b.link = setIt(a, b);
        System.out.println(a.link.value + " " + b.link.value);//Null pointer exception
    }

    public static Holder setIt(final Holder x, final Holder y) {
        x.link = y.link;
        return x;
    }
}

//class Base{
//    public short getValue(){ return 1;}
//    class Base2 extends Base{
//        public byte getValue(){ return 2;}//duzgun override olunmuyub short>byte
//    }
//}
class TestClass1 {
    public static void main(String[] args) {
        Integer i = Integer.parseInt("0");//-128 ve 127 arasi true cunki obyekt yaranmir.128den ve -129 dan sonra yeni obyekt yaranir
        Integer j = i;
        i--;
        i++;
        System.out.println((i == j));
    }
}

class TestClass2 {
    public static void main(String[] args) {
        int x = 0;
        labelA:
        for (int i = 10; i < 0; i--) {
            int j = 0;
            labelB:
            while (j < 10) {
                if (j > 1) break labelB;
                if (i == j) {
                    x++;
                    continue labelA;
                }
                j++;
            }
            x--;
        }
        System.out.println(x);//0
    }
}

class Test {
    public static void main(String[] args) {
        int var = 20, i = 0;
        do {
            while (true) {
                if (i++ > var) break;
            }
        } while (i < var--);
        System.out.println(var);//19
    }
}

class Wrapper {
    int w = 10;
}

class TestClass3 {
    static Wrapper changeWrapper(Wrapper w) {
        w = new Wrapper();
        w.w += 9;
        return w;
    }

    public static void main(String[] args) {
        Wrapper w = new Wrapper();
        w.w = 20;
        changeWrapper(w);
        w.w += 30;
        System.out.println(w.w);//50
        w = changeWrapper(w);
        System.out.println(w.w);//19
         Object obj1 = new Object();
    }


}





