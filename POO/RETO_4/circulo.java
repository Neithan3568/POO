import java.util.Scanner;

public class circulo extends Figura {
    private double radio;

    public circulo() {
        super("Círculo");
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        radio = sc.nextDouble();
        sc.close();
    }
}

