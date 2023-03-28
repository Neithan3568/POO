import java.util.Scanner;

public class PPT  {

    private String[] opciones = {"Piedra", "Papel", "Tijera"};
    private int opcionJugador;
    private int opcionCPU;
    private String resultado;

    // Constructor por defecto
    public PPT() {}

    // Método para obtener la opción elegida por el jugador
    public void pedirOpcionJugador() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Elige tu opción:");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");
            this.opcionJugador = scanner.nextInt();
        }
    }

    // Método para generar aleatoriamente la opción de la CPU
    public void generarOpcionCPU() {
        this.opcionCPU = (int) (Math.random() * 3) + 1;
    }

    // Método para determinar el resultado del juego
    public void determinarResultado() {
        if (this.opcionJugador == this.opcionCPU) {
            this.resultado = "Empate";
        } else if (this.opcionJugador == 1 && this.opcionCPU == 3 ||
                   this.opcionJugador == 2 && this.opcionCPU == 1 ||
                   this.opcionJugador == 3 && this.opcionCPU == 2) {
            this.resultado = "Ganaste!";
        } else {
            this.resultado = "Perdiste :(";
        }
    }

    // Implementación del método iniciar de la interfaz Juego
    @Override
    public void iniciar() {
        System.out.println("Bienvenido al juego Piedra, Papel o Tijera");
    }

    // Implementación del método jugar de la interfaz Juego
    @Override
    public void jugar() {
        this.pedirOpcionJugador();
        this.generarOpcionCPU();
        System.out.println("Tu elegiste: " + this.opciones[this.opcionJugador - 1]);
        System.out.println("La CPU eligió: " + this.opciones[this.opcionCPU - 1]);
        this.determinarResultado();
        System.out.println(this.resultado);
    }

    // Implementación del método finalizar de la interfaz Juego
    @Override
    public void finalizar() {
        System.out.println("Gracias por jugar!");
    }

    // Método main para la ejecución del juego
    public static void main(String[] args) {
        PPT juego = new PPT();
        juego.iniciar();
        int opcion;
        do {
            juego.jugar();
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("¿Quieres jugar otra vez? (1: Sí / 2: No)");
                opcion = scanner.nextInt();
            }
        } while (opcion == 1);
        juego.finalizar();
    }
}
