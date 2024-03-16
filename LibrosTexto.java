public class LibrosTexto extends Libro {
    String curso;

    public LibrosTexto(String titulo, String autor, String propietario, double precio, String curso) {
        super(titulo, autor, propietario, precio);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso: " + curso);
    }
}
