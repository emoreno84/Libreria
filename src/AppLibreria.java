import java.util.Scanner;

public class AppLibreria {

    static Scanner teclado = new Scanner(System.in);
    int opcion;
    public void iniciar(Libreria libreria){
        do {
            opcion = menu();
            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        } while (opcion != 5);
    }

    private static void anyadir(){
        System.out.println("Indique el ISBN: ");
        String isbn = teclado.nextLine();
        System.out.println("Indique el Título: ");
        String titulo = teclado.nextLine();
        System.out.println("Indique el Autor: ");
        String autor = teclado.nextLine();
        System.out.println("Indique el número de páginas: ");
        int numPaginas = teclado.nextInt();
        System.out.println("Elija el género: ");
        System.out.println("\t1 - Fantasía");
        System.out.println("\t2 - Ciencia Ficción");
        System.out.println("\t3 - Novela");
        System.out.println("\t4 - Biografía");
        System.out.println("\t5 - Histórico");
        int opcionGenero = teclado.nextInt();

        System.out.println("");

    }

    private Enums.Genero mapearNumeroGenero(){
        return null;
    }

    public int menu(){
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
