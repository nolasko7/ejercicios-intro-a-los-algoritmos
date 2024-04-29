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
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < cantLibros) {
            if(catalog.get(i).equals(libro)) {
                encontrado = true;
            }  
            i++;
        }
        catalog.remove(i);
        cantLibros--;
        
    }
    public boolean existeLibro(Libro libro) {
        assert (libro.obtenerAutor()).isEmpty() || (libro.obtenerTitulo().isEmpty());
        boolean existe = false;
        for (Libro catalog :) {
        }
        
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    

