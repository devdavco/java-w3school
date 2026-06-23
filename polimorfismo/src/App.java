public class App {
    public static void main(String[] args) throws Exception {

        Animal animal = new Animal();
        animal.animalSound();

        Dog perro = new Dog();
        perro.animalSound();

    }

}

class Animal {
    public void animalSound() {

        System.out.println("The animal makes a sound!");

    }

}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: Guau Guau");
    }

}
