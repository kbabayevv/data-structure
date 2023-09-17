package corejavatasks.practice6;

public class Animal {
    String canFly() {
        return "Response is flying";
    }

}

class Bird extends Animal {


    String canFly() {
        return "Bird is flying";
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.canFly());

        Animal bird = new Bird();
        System.out.println(bird.canFly());

        Animal cow = new Cow();
        System.out.println(cow.canFly());
    }
}

class Cow extends Animal {
    String canFly() {
        return "Cow is not flying";
    }
}
