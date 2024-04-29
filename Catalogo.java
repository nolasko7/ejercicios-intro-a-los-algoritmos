import java.util.ArrayList;
/**
 * Write a description of class Catalogo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Catalogo
{
    // instance variables - replace the example below with your own
    private int cantLibros;
    private ArrayList<Libro> catalog;
    /**
     * Constructor for objects of class Catalogo
     */
    public Catalogo()
    {
        // initialise instance variables
        cantLibros = 0;
        catalog = new ArrayList<Libro>();
    }
    public int cantidadDeLibros(){
        return cantLibros;
    }    
    public ArrayList<Libro> obtenerLibros(){
        return catalog;
    }
    public void agregarLibro(Libro libro)
    {
        catalog.add(libro);
        cantLibros++;
    }
    public void eliminarLibro(Libro libro){
        assert !((libro.obtenerAutor()).isEmpty() || (libro.obtenerTitulo().isEmpty()));
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < cantLibros) {
            if(catalog.get(i).equalss(libro)) {
                encontrado = true;
            }  
            i++;
        }
        if(encontrado) {
            catalog.remove(i-1);
        }
        cantLibros--;
        
    }
    public boolean existeLibro(Libro libro) {
        assert !((libro.obtenerAutor()).isEmpty() || (libro.obtenerTitulo().isEmpty()));
        boolean existe = false;
        for (Libro libroBiblioteca : catalog) {
            if(libroBiblioteca.equalss(libro)){
                existe = true; 
            }
        }
        return existe;
    }
    public boolean existeLibroConTitulo(String titulo) {
        assert !titulo.trim().isEmpty();
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < cantLibros) {
            if (catalog.get(i).obtenerTitulo().equals(titulo)) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }
    public Libro obtenerLibroPorTitulo(String titulo) {
        assert existeLibroConTitulo(titulo);
        Libro libro = null;
        boolean encontrado = false;
        int i = 0; 
        while (!encontrado && i < cantLibros) {
            Libro libroCorriente = catalog.get(i);
            if (libroCorriente.obtenerTitulo().equals(titulo)) {
                encontrado = true;
                libro = libroCorriente;
            }
        i++;
        }
        return libro;
    }
    public ArrayList<Libro> obtenerLibrosPorAutor(String autor) {
        ArrayList<Libro> librosDelAutor = new ArrayList<Libro>();
        for (Libro libros : catalog) {
            if (libros.obtenerAutor().equals(autor)) {
                librosDelAutor.add(libros);
            }        
        }
        return librosDelAutor;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    

