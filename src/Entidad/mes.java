package Entidad;

public class mes {

    protected int mes;

    public mes() {
    }

    public mes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "mes{" + "mes=" + mes + '}';
    }
    
    
}
