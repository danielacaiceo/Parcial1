import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Libro[] libros = new Libro[10]; 

        int opcion;
        int indice = 0; 

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar libro de texto");
            System.out.println("2. Agregar novela");
            System.out.println("3. Agregar libro de texto de UNIAJC");
            System.out.println("4. Mostrar libros almacenados");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro de texto: ");
                    String tituloTexto = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro de texto: ");
                    String autorTexto = scanner.nextLine();
                    System.out.print("Ingrese el propietario del libro de texto: ");
                    String propietarioTexto = scanner.nextLine();
                    System.out.print("Ingrese el precio del libro de texto: ");
                    double precioTexto = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Ingrese el curso del libro de texto: ");
                    String curso = scanner.nextLine();

                    libros[indice] = new LibrosTexto(tituloTexto, autorTexto, propietarioTexto, precioTexto, curso);
                    indice++;
                    break;
                case 2:
                    System.out.print("Ingrese el título de la novela: ");
                    String tituloNovela = scanner.nextLine();
                    System.out.print("Ingrese el autor de la novela: ");
                    String autorNovela = scanner.nextLine();
                    System.out.print("Ingrese el propietario de la novela: ");
                    String propietarioNovela = scanner.nextLine();
                    System.out.print("Ingrese el precio de la novela: ");
                    double precioNovela = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Ingrese el tipo de novela: ");
                    String tipoNovela = scanner.nextLine();

                    libros[indice] = new novelas(tituloNovela, autorNovela, propietarioNovela, precioNovela, tipoNovela);
                    indice++;
                    break;
                case 3:
                    System.out.print("Ingrese el título del libro de texto de UNIAJC: ");
                    String tituloUNIAJC = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro de texto de UNIAJC: ");
                    String autorUNIAJC = scanner.nextLine();
                    System.out.print("Ingrese el propietario del libro de texto de UNIAJC: ");
                    String propietarioUNIAJC = scanner.nextLine();
                    System.out.print("Ingrese el precio del libro de texto de UNIAJC: ");
                    double precioUNIAJC = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Ingrese el curso del libro de texto de UNIAJC: ");
                    String cursoUNIAJC = scanner.nextLine();
                    System.out.print("Ingrese la facultad del libro de texto de UNIAJC: ");
                    String facultadUNIAJC = scanner.nextLine();

                    libros[indice] = new LibrosTextoUNIAJC(facultadUNIAJC, tituloUNIAJC, autorUNIAJC, propietarioUNIAJC, precioUNIAJC, cursoUNIAJC);
                    indice++;
                    break;
                case 4:
                    mostrarLibros(libros, indice);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 5);
    }


    public static void mostrarLibros(Libro[] libros, int cantidad) {
        System.out.println("Información de los libros almacenados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("el libro pertenece a : " + libros[i].getClass().getSimpleName());
            libros[i].imprimirInformacion();
            System.out.println("-----------------------------");
        }
    }
}
