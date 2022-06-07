package boletin34;


public class Futbolista extends SeleccionFutbol {

    int dorsal;
    String demarcacion;
    
    public void entrevista(){
        System.out.println("El futbolista da una entrevista");
    }
    @Override
    public void concentrarse() {
        System.out.println("El futbolista se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El futbolista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista juega el partido");
    }

    @Override
    public String toString() {
        return "Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }
    
    
}
