public class LibrosTextoUNIAJC extends LibrosTexto{
    String facultad;

    public LibrosTextoUNIAJC(String facultad, String titulo, String autor, String propietario, double precio, String curso) {
        super(titulo, autor, propietario, precio, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Facultad: " + facultad);
    }
}
