public class App {
    public static void main(String[] args) throws Exception {

        Person persona = new Person();

        // y se accede a sus propiedades por medio de los setters y getters
        persona.setName("Juan");
        System.out.println(persona.getName());
    }
}
