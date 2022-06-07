package boletin34;

import java.util.ArrayList;


public class Boletin34 {


    public static void main(String[] args) {
        
        ArrayList<SeleccionFutbol> lista = new ArrayList<>();
        Futbolista furbo = new Futbolista();
        Masajista masaje = new Masajista();
        Entrenador entr = new Entrenador();
        Seleccionador selec = new Seleccionador();
        lista.add(entr);
        lista.add(selec);
        lista.add(furbo);
        lista.add(masaje);
       
        System.out.println(lista);
    }
    
}
