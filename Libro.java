
/**
 * Esta clase representa un libro para una biblioteca personal.
 *
 * @author Simón Gutiérrez Brida
 * @version 1.0
 */
public class Libro {
    private String autor;
    private String titulo;
    private int paginas;
    private boolean prestado;

    /**
     * Constructor de Libro
     * @param autorLibro    el autor del libro, no puede ser {@code null}, vacío, o contener solo espacios
     * @param tituloLibro   el título del libro, no puede ser {@code null}, vacío, o contener solo espacios
     * @param paginasLibro  la cantidad de páginas del libro, debe ser un valor positivo, mayor estricto a 0
     */
    public Libro(String autorLibro, String tituloLibro, int paginasLibro) {
        assert cadenaValida(autorLibro) : "autorLibro no es una cadena válida";
        assert cadenaValida(tituloLibro) : "tituloLibro no es una cadena válida";
        assert paginasLibro >= 0 : "paginasLibro no es un valor válido";
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = paginasLibro;
        prestado = false;
    }
    
    /**
     * Cambia el autor del libro
     * @param nuevoAutor    el nuevo autor del libro
     */
    public void cambiarAutor(String nuevoAutor) {
        autor = nuevoAutor;
    }
    
    /**
     * Cambia el título del libro
     * @param nuevoTitulo   el nuevo título del libro
     */
    public void cambiarTitulo(String nuevoTitulo) {
        titulo = nuevoTitulo;
    }
    
    /**
     * Cambia la cantidad de páginas del libro
     * @param nuevasPaginas  la nueva cantidad de páginas del libro, debe ser un valor positivo, mayor estricto a 0
     */
    public void cambiarPaginas(int nuevasPaginas) {
        assert nuevasPaginas >= 0 : "valor inválido para páginas";
        paginas = nuevasPaginas;
    }
    
    /**
     * Marca el libro como prestado
     */
    public void prestar() {
        prestado = true;
    }
    
    /**
     * Marca el libro como no prestado
     */
    public void devolver() {
        prestado = !prestado;
    }
    
    /**
     * Retorna el autor del libro
     * @return el autor del libro
     */
    public String obtenerAutor() {
        return autor;
    }
    
    /**
     * Retorna el título del libro
     * @return el título del libro
     */
    public String obtenerTitulo() {
        return titulo;
    }

    /**
     * Retorna las páginas del libro
     * @return las páginas del libro
     */
    public int obtenerPaginas() {
        return paginas;
    }
    
    /**
     * Retorna si el libro está prestado o no
     * @return {@code true} sii el libro está prestado
     */
    public boolean estaPrestado() {
        return prestado;
    }
    
    /* (non-javadoc)
     * Verifica si una cadena es distinta a {@code null}, no vacía, y no contiene solo espacios.
     * @param cadena    la cadena a verificar
     * @return {@code true} sii {@code cadena} es distinta a {@code null}, no vacía, y no contiene solo espacios
     */
    private boolean cadenaValida(String cadena) {
        if (cadena == null) {
            return false;
        }
        if (cadena == "") {
            return false;
        }
        boolean soloEspacios = true;
        for (char caracter : cadena.toCharArray()) {
            if (caracter != ' ' || caracter != '\t' || caracter != '\n') {
                soloEspacios = false;
            }
        }
        return !soloEspacios;
    }
    
    /**
     * Verifica si este libro es igual a otro
     * @param otroLibro el otro libro con el cual comparar, debe ser distinto de {@code null}
     * @return {@code true} sii este libro es igual a {@code otroLibro}
     */
    public boolean equalss(Libro otroLibro) {
        assert otroLibro != null : "el otro libro es null";
        if (paginas != otroLibro.obtenerPaginas()) {
            return false;
        }
        if (autor != otroLibro.obtenerAutor()) {
            return false;
        }
        if (titulo != otroLibro.obtenerTitulo()) {
            return false;
        }
        return true;
    }
}