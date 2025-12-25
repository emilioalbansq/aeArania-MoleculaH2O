package Arania;

public class ControllerArania {

    
    Arania arania = new Arania("Sombra", "Araña Patona");
    
    public void iniciarArania() {
        System.out.println("____________________ARAÑA____________________");
        System.out.println(arania.toString());
        arania.mover();
        Veneno veneno = new Veneno(5);
        arania.atacar(veneno);
        Seda seda = new Seda(20);
        arania.abdomen.realizarTelaraña(seda);
        System.out.println("______________________________________________");
    }
}
