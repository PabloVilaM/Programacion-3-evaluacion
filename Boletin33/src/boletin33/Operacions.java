package boletin33;

import java.util.ArrayList;


public class  Operacions <T extends Comparable> {
    
    public void calculoMinimo(ArrayList<T> lista){
        T finale = null;
        T finale2 = null;
        for (int i = 0; i<lista.size();i++){
            int resultado = lista.get(i).compareTo(i+1);
            
            if (resultado > 0){
                System.out.println("El primero es mayor");
                finale = lista.get(i);
                
                
            }
            else if (resultado < 0){
                System.out.println("El primero es menor");
                finale2 = lista.get(i);
                
            }
            else{
                System.out.println("Son iguales");
            }
        }
        System.out.println("El menor es: " + finale2);
        System.out.println("El mayor es: " + finale);
    }
    
    public void buscar(ArrayList<T> lista, Object objecto){
        int a = 0;
        for (T elemento:lista){
            a++;
            if (elemento==objecto){
                System.out.println("Posición del elemento: " + a);
            }
            else{
                System.out.println("Elemento no encontrado");
            }
        }
    }
    
     public T eliminar(ArrayList<T> lista, Object objecto){
        int a = 0;
        T dato = null;
        for (T elemento:lista){
            a++;
            if (elemento==objecto){
                lista.remove(lista.get(a));
                System.out.println("Elemento eliminado: " + a);
                dato = elemento;
            }
            else{
                System.out.println("Elemento no encontrado no se puede eliminar");
            }
            
        }
        return dato;
    }
    
}
