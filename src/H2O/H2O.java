package H2O;

public class H2O implements IPolaridad, IEstado{
    private double anguloEnlace;
    Termodinamica temp = new Termodinamica();

    public double getAnguloEnlace() {
        return anguloEnlace;
    }

    

    public void setAnguloEnlace(double anguloEnlace) {
        this.anguloEnlace = anguloEnlace;
    }

    private Oxigeno o = new Oxigeno();
    private Hidrogeno h1 = new Hidrogeno();
    private Hidrogeno h2 = new Hidrogeno();

    public H2O(){
        setO(o);
        setH1(h1);
        setH2(h2);
        setAnguloEnlace(anguloEnlace);
    }

    @Override
    public double calcularMomentoDipolar() {
        return 1.85; // Valor constante del agua en Debyes
    }

    @Override
    public void definirFisica() {
        if (temp.gettemperatura() <= 0) {
            System.out.println("Estado: Sólido (Hielo)");
        } else if (temp.gettemperatura() >= 100) {
            System.out.println("Estado: Gaseoso (Vapor)");
        } else {
            System.out.println("Estado: Líquido");
        }
    }

    public Oxigeno getO() {
        return o;
    }

    public void setO(Oxigeno o) {
        this.o = o;
    }

    public Hidrogeno getH1() {
        return h1;
    }

    public void setH1(Hidrogeno h1) {
        this.h1 = h1;
    }

    public Hidrogeno getH2() {
        return h2;
    }

    public void setH2(Hidrogeno h2) {
        this.h2 = h2;
    }

    
}
