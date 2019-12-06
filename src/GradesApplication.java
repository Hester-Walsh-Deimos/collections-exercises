import java.util.HashMap;
import java.util.Scanner;

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
        boolean choice;


        do {
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        for (HashMap.Entry<String, Student> student : students.entrySet()) {
            System.out.print("|" + student.getKey() + "| ");
        }
        System.out.println("\n What student would you like to see more information on?");
        Scanner input = new Scanner(System.in);
        String selection = input.nextLine();
        if (students.get(selection) != null){
            System.out.println("Name: " + students.get(selection).getName());
            System.out.println("Grade: " + students.get(selection).getGradeAverage());
        } else {
            System.out.printf("User %s does not exist.\n", selection);
        }
            System.out.println("Would you like to search for another student?");
            System.out.println("Yes/No");
            String choose = input.nextLine();
            if (choose.equalsIgnoreCase("yes")){
                choice = true;
            } else {
                choice = false;
            }

    } while (choice);
    }
}
