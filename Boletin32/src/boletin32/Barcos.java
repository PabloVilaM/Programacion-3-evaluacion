package boletin32;



public abstract class Barcos {
    
    private String matricula;
    private int dias;
    private int longitud;

    public Barcos(String matricula, int dias, int longitud) {
        this.matricula = matricula;
        this.dias = dias;
        this.longitud = longitud;
    }

    public Barcos() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    @Override
    public String toString() {
        return "Barcos{" + "matricula=" + matricula + ", dias=" + dias + ", longitud=" + longitud + '}';
    }
    
    public abstract float moduloEspecial();
    
}
