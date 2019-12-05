import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student bryan = new Student("Bryan");
        Student nico = new Student("Nico");
        Student jacob = new Student("Jacob");
        Student andrew = new Student("NaNDrew");

        bryan.addGrade(98);
        bryan.addGrade(100);
        bryan.addGrade(81);
        nico.addGrade(91);
        nico.addGrade(75);
        nico.addGrade(86);
        jacob.addGrade(100);
        jacob.addGrade(100);
        jacob.addGrade(99);
        andrew.addGrade(72);
        andrew.addGrade(92);
        andrew.addGrade(100);

        students.put("floofer", bryan);
        students.put("vogue", nico);
        students.put("dexter", jacob);
        students.put("squirrel", andrew);

        System.out.println(jacob.getGradeAverage());

    }
}
