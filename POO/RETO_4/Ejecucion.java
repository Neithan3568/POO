import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione la figura geométrica a la cual desea calcular el área:");
            System.out.println("1. Triángulo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Triangulo triangulo = new Triangulo();
                    triangulo.pedirDatos();
                    System.out.println(triangulo.toString());
                    break;
                case 2:
                    Rectangulo rectangulo = new Rectangulo();
                    rectangulo.pedirDatos();
                    System.out.println(rectangulo.toString());
                    break;
                case 3:
                    circulo circulo = new circulo();
                    circulo.pedirDatos();
                    System.out.println(circulo.toString());
            }
        }
    }
}

