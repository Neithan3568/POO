// Clase Persona en el paquete Salud
package Salud;

public class RETO2 {
    // Atributos
    private String tipoDoc;
    private String documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    
    // Métodos
    public void pedirDatos() {
        // solicitar datos de la persona
        // ...
    }
    
    public void mostrarPersona() {
        // imprimir los datos ingresados
        // ...
    }
    
    public String calcularImc() {
        double pesoActual = peso / (estatura * estatura);
        if (pesoActual < 20) {
            return "PESOBAJO";
        } else if (pesoActual >= 20 && pesoActual <= 25) {
            return "PESOIDEAL";
        } else {
            return "SOBREPESO";
        }
    }
    
    public boolean mayorEdad() {
        return edad >= 18;
    }
}
