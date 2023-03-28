public class Persona {
    private String tipo_documento;
    private String numero_documento;
    private String nombres;
    private String apellidos;

    public Persona(String tipo_documento, String numero_documento, String nombres, String apellidos) {
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getTipoDocumento() {
        return tipo_documento;
    }

    public void setTipoDocumento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumeroDocumento() {
        return numero_documento;
    }

    public void setNumeroDocumento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}

public class Empleado extends Persona {
    private String cargo;
    private double valor_hora;
    private int horas_trabajadas;
    private String departamento;

    public Empleado(String tipo_documento, String numero_documento, String nombres, String apellidos, String cargo, double valor_hora, int horas_trabajadas, String departamento) {
        super(tipo_documento, numero_documento, nombres, apellidos);
        this.cargo = cargo;
        this.valor_hora = valor_hora;
        this.horas_trabajadas = horas_trabajadas;
        this.departamento = departamento;
    }

    public double calcularHonorarios() {
        double total_honorarios = valor_hora * horas_trabajadas;
        double retencion = total_honorarios * 0.00966;
        return total_honorarios - retencion;
    }

    public void imprimirInformacion() {
        System.out.println("Tipo de documento: " + getTipoDocumento());
        System.out.println("Numero de documento: " + getNumeroDocumento());
        System.out.println("Nombres: " + getNombres());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Cargo: " + cargo);
        System.out.println("Horas trabajadas: " + horas_trabajadas);
        System.out.println("Valor hora: " + valor_hora);
        System.out.println("Total a pagar: " + calcularHonorarios());
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
