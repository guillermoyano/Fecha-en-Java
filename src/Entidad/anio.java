package Entidad;

public class anio {

    protected int anio;
    

    public anio() {
    }

    public anio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "anio{" + "anio=" + anio + '}';
    }

    
}
