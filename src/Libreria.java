public class Libreria {

    private final int MAX_LIBROS = 30;
    private Libro[] listadoLibros;

    public Libreria(){
        listadoLibros = new Libro[MAX_LIBROS];
    }

    public int getMAX_LIBROS() {
        return MAX_LIBROS;
    }

    public Libro[] getListadoLibros() {
        return listadoLibros;
    }

    public boolean anyadirLibro(Libro libro){
        for (int i = 0; i < listadoLibros.length; i++){
            if (listadoLibros[i] == null){
                listadoLibros[i] = libro;
                return true;
            }
        }
        return false;
    }

    public int numLibros(){
        for (int i = 0; i < listadoLibros.length; i++){
            if (listadoLibros[i] == null){
                return i;
            }
        }
        return MAX_LIBROS;
    }

    public Libro buscarPorISBN(String isbn){
        for (int i = 0; i < listadoLibros.length; i++){
            if (listadoLibros[i] != null){
                if (listadoLibros[i].getIsbn().equalsIgnoreCase(isbn)){
                    return listadoLibros[i];
                }
            }
        }
        return null;
    }

    public Libro buscarPorAutor(String autor){
        for (int i = 0; i < listadoLibros.length; i++){
            if (listadoLibros[i] != null){
                if (listadoLibros[i].getAutor().equalsIgnoreCase(autor)){
                    return listadoLibros[i];
                }
            }
        }
        return null;
    }


}
