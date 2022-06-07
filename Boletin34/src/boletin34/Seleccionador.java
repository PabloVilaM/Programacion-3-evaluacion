package boletin34;



public class Seleccionador extends SeleccionFutbol {

    String nombre2;
    int edad2;
    String apelidos2;
    int id2;
    
    @Override
    public void concentrarse() {
        System.out.println("El seleccionador se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El seleccionador viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El seleccionador entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El seleccionador juega el partido");
    }
    
    public void seleccionarXogador(){
        System.out.println("El seleccionador selecciona a un xogador");
    }

    @Override
    public String toString() {
        return "Seleccionador{" + "nombre2=" + nombre2 + ", edad2=" + edad2 + ", apelidos2=" + apelidos2 + ", id2=" + id2 + '}';
    }
    
    
    
}
