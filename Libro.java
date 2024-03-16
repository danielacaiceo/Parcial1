public class Libro {
    private String titulo;
    private String autor;
    private String propietario;
    private double precio;

    public Libro(String titulo, String autor, String propietario, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.propietario = propietario;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void imprimirInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Propietario: " + propietario);
        System.out.println("Precio: $" + precio);
    }
}