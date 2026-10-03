package GTA;

public class LawEnforcement {
    public void arrest() {
        System.out.println("Law enforcement is making an arrest");
    }
}
class Cops extends LawEnforcement {
    private String precinct;
    public Cops(String pre) {
        precinct = pre;
    }
    @Override
    public void arrest() {
        System.out.println("Cops from " + precinct + " precinct are chasing suspect");
    }
}

class Helicopter extends LawEnforcement{
    private String helicopterID;
    public Helicopter(String hid) {
        helicopterID = hid;
    }
    @Override
    public void arrest() {
        System.out.println("Helicopter team " + helicopterID + " is assisting from sky");
    }
}

class SWAT extends LawEnforcement {
    private int teamNum;
    public SWAT(int tm){
        teamNum = tm;
    }
    @Override
    public void arrest() {
        System.out.println("SWAT Team " + teamNum + " is making a high-stakes arrest");
    }
}

class BlackHawks extends LawEnforcement {
    private int tacticalCode;
    public BlackHawks(int tc) {
        tacticalCode = tc;
    }
    @Override
    public void arrest() {
        System.out.println("Black Hawks unit with tactical code " + tacticalCode + " is ready to take suspect down");
    }
}