import Arania.ControllerArania;
import H2O.ControllerH2O;

public class App {
    public static void main(String[] args) throws Exception {
        ControllerArania controllerA = new ControllerArania();
        controllerA.iniciarArania();

        ControllerH2O controllerH = new ControllerH2O();
        controllerH.inicializarH2O();
    }
}
