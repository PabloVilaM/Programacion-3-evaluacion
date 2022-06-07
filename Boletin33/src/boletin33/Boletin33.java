
package boletin33;

import java.util.ArrayList;

public class Boletin33 <T> {


    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(3);
        lista.add(1);
        lista.add(5);
        lista.add(0);
        Operacions op = new Operacions();
        op.calculoMinimo(lista);
        op.buscar(lista, 1);
        op.eliminar(lista, 1);
        
    }
    
}
