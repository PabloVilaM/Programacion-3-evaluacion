package boletin32;



public class Deportivas extends Barcos {
    
    float Potencia;

    @Override
    public float moduloEspecial() {
        float esp = Potencia*2;
        return esp;
    }

    public Deportivas(float Potencia, String matricula, int dias, int longitud) {
        super(matricula, dias, longitud);
        this.Potencia = Potencia;
    }

    @Override
    public String toString() {
        return "Deportivas{" + "Potencia=" + Potencia + super.toString() + '}';
    }
    
    
}
