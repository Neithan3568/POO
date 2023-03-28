// Crear el paquete Salud
package Salud;

public class persona {
    public static void main(String[] args) {
        // Crear objetos de la clase Persona
        persona persona1 = new persona();
        persona persona2 = new persona();
        
        // Ejecutar los métodos de la clase Persona
        persona1.pedirDatos();
        persona1.mostrarPersona();
        persona1.calcularImc();
        System.out.println("Es mayor de edad? " + persona1.mayorEdad());
        
        persona2.pedirDatos();
        persona2.mostrarPersona();
        persona2.calcularImc();
        System.out.println("Es mayor de edad? " + persona2.mayorEdad());
    }

    private String mayorEdad() {
        return null;
    }

    private void calcularImc() {
    }

    private void mostrarPersona() {
    }

    private void pedirDatos() {
    }
}

