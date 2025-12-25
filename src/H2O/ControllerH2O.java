package H2O;

public class ControllerH2O {

    public void inicializarH2O(){
        H2O agua = new H2O();
        System.out.println("_________________H2O____________________");
        agua.definirFisica();
        System.out.println("Momento Dipolar: " + agua.calcularMomentoDipolar());

    }
}
