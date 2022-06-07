package boletin32;



public class Metodos {
    
    public static int calculoAlurguer(int dias, int longi){
        int a = calculoModulo(longi);
        int b = a*dias;
        return b;
    }
    
    public static int calculoModulo(int longi){
        int modulo = longi*10;
        return modulo;
    }

    
}
