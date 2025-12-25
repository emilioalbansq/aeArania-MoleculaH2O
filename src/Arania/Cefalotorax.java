package Arania;

import java.util.ArrayList;
import java.util.List;

public class Cefalotorax {

    public List<Pata> PDer = new ArrayList<>();
    public List<Pata> PIzq = new ArrayList<>();;

    public Cefalotorax() {

        for (int i = 1; i <= 4; i++) {
            this.PDer.add(new Pata(i, "Derecho"));
        }
        for (Pata p : PDer) p.mover();
        for (int i = 1; i <= 4; i++) {
            this.PIzq.add(new Pata(i, "Izquierdo"));
        }
        for (Pata p : PIzq) p.mover();
    }
}
