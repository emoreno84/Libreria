import java.util.Scanner;

public class AppLibreria {

    static Scanner teclado = new Scanner(System.in);

    static int opcion;
    public static void iniciar(Libreria libreria){
        do {
            opcion = menu();
            switch (opcion){
                case 1:
                    anyadir(libreria);
                    break;
                case 2:
                    break;
                case 3:
                    buscarLibro(libreria);
                    break;
                case 4:
                    mostrarListadoLibros(libreria);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Indique una opción válida...");
            }

        } while (opcion != 5);
    }

    private static void mostrarListadoLibros(Libreria libreria){
        System.out.println(libreria.toString());
    }

    private static void buscarLibro(Libreria libreria){
        String varAux;
        System.out.println("Elija el método de búsqueda: ");
        System.out.println("\t1 - ISBN");
        System.out.println("\t2 - Autor");
        System.out.println("\t3 - Título");
        Libro libro = null;
        int opcionBusqueda;
        do {
            opcionBusqueda = teclado.nextInt();
            switch (opcionBusqueda){
                case 1:
                    System.out.println("Introduzca el ISBN:");
                    varAux = teclado.next();
                    libro = libreria.buscarPorISBN(varAux);
                    break;
                case 2:
                    System.out.println("Introduzca el autor:");
                    varAux = teclado.next();
                    libro = libreria.buscarPorAutor(varAux);
                    break;
                case 3:
                    System.out.println("Introduzca el título:");
                    varAux = teclado.next();
                    libro = libreria.buscarPorTitulo(varAux);
                    break;
                default:
                    System.out.println("Elija una opción válida...");
                    break;
            }
        } while (opcionBusqueda < 1 || opcionBusqueda > 3);

        if (libro != null){
            System.out.println(libro.toString());
        }else {
            System.out.println("Libro no encontrado...");
        }

    }

    private static void anyadir(Libreria libreria){
        String isbn;
        String titulo;
        String autor;
        System.out.println("Indique el ISBN: ");
        isbn = teclado.nextLine();
        teclado.next();
        System.out.println("Indique el Título: ");
        titulo = teclado.nextLine();
        teclado.next();
        System.out.println("Indique el Autor: ");
        autor = teclado.nextLine();
        teclado.next();
        System.out.println("Indique el número de páginas: ");
        int numPaginas = teclado.nextInt();
        System.out.println("Elija el género: ");
        System.out.println("\t1 - Fantasía");
        System.out.println("\t2 - Ciencia Ficción");
        System.out.println("\t3 - Novela");
        System.out.println("\t4 - Biografía");
        System.out.println("\t5 - Histórico");
        int opcionGenero = teclado.nextInt();
        Enums.Genero genero;
        do {
            genero = mapearNumeroGenero(opcionGenero);
        } while(genero == null);
        libreria.anyadirLibro(new Libro(isbn, titulo, autor, numPaginas, genero));
        System.out.println("LIBRO AÑADIDO CORRECTAMENTE");
    }

    private static Enums.Genero mapearNumeroGenero(int opcion){
        if(opcion == 1){
            return Enums.Genero.FANTASIA;
        } else if (opcion == 2) {
            return Enums.Genero.CIENCIA_FICCION;
        } else if (opcion == 3) {
            return Enums.Genero.NOVELA;
        } else if (opcion == 4) {
            return Enums.Genero.BIOGRAFIA;
        } else if (opcion == 5) {
            return Enums.Genero.HISTORICO;
        }else {
            return null;
        }
    }

    public static int menu(){
        System.out.println("Elija una opción...");
        System.out.println("1 - Añadir libro");
        System.out.println("2 - Eliminar libro");
        System.out.println("3 - Buscar libro");
        System.out.println("4 - Mostrar listado libros");
        System.out.println("5 - Salir");
        int opcion = teclado.nextInt();
        return opcion;
    }



}
