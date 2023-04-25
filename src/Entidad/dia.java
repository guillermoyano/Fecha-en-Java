package Entidad;

public class dia {

    protected int dia;

    public dia() {
    }

    public dia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "dia{" + "dia=" + dia + '}';
    }


}
