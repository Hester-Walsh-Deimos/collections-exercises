import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public float getGradeAverage() {
        float total = 0;
        for (float grade : grades) {
            total += grade;
        }
        float average = total / grades.size();
        return average;
    }


    public static void main(String[] args) {

        Student jw = new Student("JW");

        jw.addGrade(92);
        jw.addGrade(90);
        jw.addGrade(80);


        System.out.println("jw.getName() = " + jw.getName());
        System.out.println("jw.grades = " + jw.grades);
        System.out.println(jw.getGradeAverage());


    }
}

