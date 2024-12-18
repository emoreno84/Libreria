import java.util.Scanner;

public class AppLibreria {

    Scanner teclado = new Scanner(System.in);
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
