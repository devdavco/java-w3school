public class App {
    public static void main(String[] args) throws Exception {


        //Inner class. Pienso en una casa que tiene una habitación. 

        //Casa 
        class Casa{

            int capacidad = 10;

            class Habitacion{

                int capacidad = 2;

                class Baño{

                    int capacidad = 2;

                }

            }

            class Comedor {

                int capacidad = 4;
       
            }
        }

        Casa casa = new Casa();

        Casa.Habitacion hab1 = casa.new Habitacion();

        Casa.Habitacion.Baño baño = hab1.new Baño();

        Casa.Comedor comedor = casa.new Comedor();

        System.out.println(casa.capacidad);
        System.out.println(hab1.capacidad + comedor.capacidad);

        System.out.println("Capacidad baño: " + baño.capacidad);
    }
}
