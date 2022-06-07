package boletin34;


public class Masajista extends SeleccionFutbol {

    
    String titulacion;
    int aniosExperiencia;
    
    @Override
    public void concentrarse() {
        System.out.println("El masajista se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El masajista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El masajista juega el partido");
    }
    
    public void darMasaje(){
        System.out.println("O masajista da masaje");
    }

    @Override
    public String toString() {
        return "Masajista{" + "titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + '}';
    }
    
    
    
}
