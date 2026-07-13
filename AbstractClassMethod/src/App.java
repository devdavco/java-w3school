
// definición clase abstracta
abstract class Animal {

    public abstract void makeSound();

    public void sleep() {

        System.out.println("Time to Sleep");
    }

}

class Pig extends Animal {

    public void makeSound() {

        System.out.println("Oink pink");

    }

}

public class App {

    public static void main(String[] args) throws Exception {

        Animal myPig = new Pig();

        myPig.makeSound();
        myPig.sleep();
    }

}