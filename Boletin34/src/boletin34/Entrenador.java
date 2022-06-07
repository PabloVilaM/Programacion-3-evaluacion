package boletin34;


public class Entrenador extends SeleccionFutbol {

    int idFederacion;
    
    public void planificarEntrenamiento(){
        System.out.println("Planifica el entrenamiento");
    }
    @Override
    public void concentrarse() {
        System.out.println("El entrenador se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El entrenador juega");
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    
    
}
