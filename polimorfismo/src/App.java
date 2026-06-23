public class App {
    public static void main(String[] args) throws Exception {

        // Animal animal = new Animal();
        // animal.animalSound();

        Dog perro = new Dog();
        perro.animalSound();
        perro.printType();
    }

}

class Animal {
    String type = "animalito";
    Animal() {
        System.out.println("Animal is created!");
    }

    public void animalSound() {

        System.out.println("The animal makes a sound!");

    }

}

class Dog extends Animal {
    String type = "perrito";

    //Constructor clase Dog
    Dog() {
        //llamar al constructor de la clase padre con super
        super();
        System.out.println("I'm a new Dog!");
    }
    // método clase Dog - 
    public void animalSound() {
        //con super, puedo llamar al metodo de la clase padre
        super.animalSound();
        System.out.println("The dog says: Guau Guau");
    }

    public void printType(){

        System.out.println("Imprimiendo atributo clase hija:");
        System.out.println(type);

        System.out.println("Imprimiendo atributo clase padre:");
        System.out.println(super.type);
    }

}


//Resumen : 

/*
Polimorfismo tiene relación con herencia, consiste en many forms, hereda los metodos de clase padre y permite que se comporten de diversas formas
*/