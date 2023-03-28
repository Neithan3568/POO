import java.util.Scanner;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo() {
        super("Rectángulo");
    }

    public double calcularArea() {
        return base * altura;
    }

    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        base = sc.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        altura = sc.nextDouble();
        sc.close();
    }
}

