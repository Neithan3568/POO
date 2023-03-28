
package Salud;

public class RETO1 {
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
    
    public void calcularImc() {
        double pesoActual = peso / (estatura * estatura);
        if (pesoActual < 20) {
            System.out.println("El peso está por debajo de lo ideal");
        } else if (pesoActual >= 20 && pesoActual <= 25) {
            System.out.println("El peso es ideal");
        } else {
            System.out.println("Tiene sobrepeso");
        }
    }
    
    public boolean mayorEdad() {
        return edad >= 18;
    }
}

