package boletin32;

import java.util.ArrayList;


public class Boletin32 {

    
    public static void main(String[] args) {
      
        ArrayList <Barcos> lista = new ArrayList<>();
        Barcos ve = new Veleros(4,"48273847s",10,100);
        Barcos ya = new Yates(20.5f,20,"2392482984a",10,100);
        Barcos de = new Deportivas(20.5f,"242984198j",10,100);
        lista.add(de);
        lista.add(ve);
        lista.add(ya);
        Metodos.calculoAlurguer(10, 100);
        
        for (int i = 0; i < lista.size();i++){
            System.out.println(lista.get(i));
        }
        
    }
    
}
