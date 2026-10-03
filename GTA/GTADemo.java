package GTA;

import java.util.*;

public class GTADemo {
    public static void main(String[] args) {
        LawEnforcement c1 = new Cops("Brooklyn99");
        LawEnforcement h1 = new Helicopter("TXT-5");
        LawEnforcement s1 = new SWAT(666);
        LawEnforcement bh1 = new BlackHawks(143);

        ArrayList<LawEnforcement> allUnits = new ArrayList<>();
        allUnits.add(c1);
        allUnits.add(h1);
        allUnits.add(s1);
        allUnits.add(bh1);

        //call arrest method for all units
        for (LawEnforcement unit : allUnits) //look into enhanced loops pls its been a semester im still confused
            unit.arrest();
    }
}
