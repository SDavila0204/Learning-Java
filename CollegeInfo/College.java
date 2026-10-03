package CollegeInfo;
import java.util.ArrayList;

public class College {
    private String name;
    private ArrayList<String> faculty;
    private Dean dean;

    public College(String name, ArrayList<String> flist, Dean d) {
        this.name = name;
        faculty = flist;
        dean = new Dean(d); //deep copy
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaculty(ArrayList<String> flist) {
        faculty = flist;
    }

    public void setDean(Dean d) {
        dean = new Dean(d); //deep copy
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getFaculty() {
        return faculty;
    }

    public Dean getDean() {
        return new Dean(dean); //returned deep copy
    }

    public String toString() {
        return "College: " + name + "\nFaculty: " + faculty + "\nDean: " + dean;
    }
}
