package Arania;

public class Pata implements IMovimiento {

    private int posicion;
    private String lado;

    public Pata(int posicion, String lado) {
        setLado(lado);
        setPosicion(posicion);
    }

    @Override
    public void mover() {
        System.out.println("Se mueve la pata N°: " + getPosicion() + " del lado " + getLado());
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

}
