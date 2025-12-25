package H2O;

public abstract class Elemento {
    private double masaAtomica;
    private String simbolo;

    public Elemento(double masaAtomica, String simbolo){
        setMasaAtomica(masaAtomica);
        setSimbolo(simbolo);
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Masa Atomica: " + getMasaAtomica() + "\n" +
               "Simbolo: " + getSimbolo();
    }

    public double getMasaAtomica() {
        return masaAtomica;
    }
    public void setMasaAtomica(double masaAtomica) {
        this.masaAtomica = masaAtomica;
    }
    public String getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }


}
