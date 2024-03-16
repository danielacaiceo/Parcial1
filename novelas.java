public class novelas  extends Libro{
    String tipo;

    public novelas(String titulo, String autor, String propietario, double precio, String tipo) {
        super(titulo, autor, propietario, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tipo: " + tipo);
    }
}
