public abstract class Figura {
    protected String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public abstract double calcularArea();

    public String toString() {
        return "Tipo de figura: " + tipo + "\nÁrea: " + calcularArea();
    }
}

