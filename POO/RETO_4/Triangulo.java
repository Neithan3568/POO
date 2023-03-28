import java.util.Scanner;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo() {
        super("Triángulo");
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        base = sc.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        altura = sc.nextDouble();
        sc.close();
    }
}

