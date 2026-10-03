package CollegeInfo;
import java.util.ArrayList;

public class CollegeDemo {
    public static void main(String[] args) {
        ArrayList<String> listt = new ArrayList<>();
        listt.add("Mrs. Marti");
        listt.add("Mr. Hwang");

        Dean d1 = new Dean("Ines", "ECE-300", 123);
        College fiu = new College("Engineering", listt, d1);

        System.out.println(fiu);
    }
}
