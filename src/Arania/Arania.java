package Arania;

public class Arania extends Aracnido implements IMovimiento, IPredador {
    
    public Cefalotorax cefalotorax = new Cefalotorax();
    public Abdomen abdomen = new Abdomen();

    public Veneno veneno;

    public Arania(String nombre, String especie) {
        super(nombre, especie);
        this.cefalotorax = cefalotorax;
        this.abdomen = abdomen;
    }

    @Override
    public String toString() {
        return "Araña de tipo: " + getEspecie() + "\n" +
               "Nombre: " + getNombre();
    }

    @Override
    public void atacar(Veneno veneno) {
        System.out.println("La araña " + getNombre() + " está atacando con su veneno de potencia " + veneno.getPotencia());
    }

    @Override
    public void mover() {
        System.out.println("La araña " + getNombre() + " se está moviendo sigilosamente...");
        
    }

}
