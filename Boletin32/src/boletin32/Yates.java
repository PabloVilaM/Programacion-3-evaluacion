package boletin32;





public class Yates extends Barcos{
    
    float Potencia;
    int nCamarotes;

    @Override
    public float moduloEspecial() {
        float esp = (2*Potencia) + (25*nCamarotes);
        return esp;
    }

    public Yates(float Potencia, int nCamarotes, String matricula, int dias, int longitud) {
        super(matricula, dias, longitud);
        this.Potencia = Potencia;
        this.nCamarotes = nCamarotes;
    }

    @Override
    public String toString() {
        return "Yates{" + "Potencia=" + Potencia + ", nCamarotes=" + nCamarotes + super.toString() + '}';
    }
    
    
}
