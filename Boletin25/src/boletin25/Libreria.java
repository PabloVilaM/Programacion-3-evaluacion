package boletin25;

import ToolboxPablo.leerDatos;
import java.util.ArrayList;



public class Libreria {
    
    public static Libro engadir(Libro libro){
        libro.setTitulo(leerDatos.leerString("Titulo del libro?"));
        libro.setAutor(leerDatos.leerString("Autor?"));
        libro.setPrecio(leerDatos.leerFloat("Precio?"));
        libro.setUnidades(leerDatos.leerInt("Unidades a añadir?"));
        return libro;
    } 
    
    public static void visualizar(ArrayList<Libro> lista){
        for(int i = 0; i<lista.size();i++){
            Libro libr = lista.get(i);
            System.out.println(libr);
        }
    }
}
