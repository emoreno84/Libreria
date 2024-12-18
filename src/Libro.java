public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;
    private Enums.Genero genero;

    public Libro(String isbn, String titulo, String autor, int numPaginas, Enums.Genero genero){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public Enums.Genero getGenero() {
        return genero;
    }

    @Override
    public String toString(){
        StringBuilder strBuilder = new StringBuilder();

        strBuilder.append("ISBN: " + this.getIsbn() + "\n");
        strBuilder.append("Título: " + this.getTitulo() + "\n");
        strBuilder.append("Autor: " + this.getAutor() + "\n");
        strBuilder.append("Número de páginas: " + this.getNumPaginas() + "\n");
        strBuilder.append("Género: " + this.getGenero() + "\n");

        return strBuilder.toString();
    }

}
