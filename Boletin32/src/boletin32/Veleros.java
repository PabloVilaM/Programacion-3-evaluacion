package boletin32;



public class Veleros extends Barcos {
    
    int nMastiles;

    @Override
    public float moduloEspecial() {
        float esp = 8*nMastiles;
        return esp;
    }

    public Veleros(int nMastiles, String matricula, int dias, int longitud) {
        super(matricula, dias, longitud);
        this.nMastiles = nMastiles;
    }

    @Override
    public String toString() {
        return "Veleros{" + "nMastiles=" + nMastiles + super.toString() + '}';
    }
    
    
    
    
}
