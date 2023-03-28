// Clase Inicio en el paquete Principal
package Salud;

// Importar la clase Persona del paquete Salud
import Salud.Persona;

public class imc {
    public static void main(String[] args) {
        // Crear objetos de la clase Persona
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        // Ejecutar los métodos de la clase Persona
        persona1.pedirDatos();
        persona1.mostrarPersona();
        String estadoPeso1 = persona1.calcularImc();
        System.out.println("Estado del peso: " + estadoPeso1);
        if (estadoPeso1.equals("PESOBAJO")) {
            System.out.println("El peso está por debajo de lo ideal");
        } else if (estadoPeso1.equals("PESOIDEAL")) {
            System.out.println("El peso es ideal");
        } else {
            System.out.println("Tiene sobrepeso");
        }
        System.out.println("Es mayor de edad? " + persona1.mayorEdad());
        
        persona2.pedirDatos();
        persona2.mostrarPersona();
        String estadoPeso2 = persona2.calcularImc();
        System.out.println("Estado del peso: " + estadoPeso2);
        if (estadoPeso2.equals("PESOBAJO")) {
            System.out.println("El peso está por debajo de lo ideal");
        } else if (estadoPeso2.equals("PESOIDEAL")) {
            System.out.println("El peso es ideal");
        } else {
            System.out.println("Tiene sobrepeso");
        }
        System.out.println("Es mayor de edad? " + persona2.mayorEdad());
    }
}
