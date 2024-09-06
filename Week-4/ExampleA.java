import java.util.ArrayList;

class Student {
    private String name;
    private float gpa;
    private int id;
    private static int count = 0;

    public Student() {
        this.name = "John Doe";
        this.gpa = 4f;
        this.id = count++;
    }

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
        this.id = count++;
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGPA() {
        return this.gpa;
    }

    public void setGPA(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Hi my name is " + name + " my id is: " + id + " GPA: " + gpa;
    }
}

public class ExampleA {
    // Just fills an ArrayList of student with some data
    public static void fillStudents(ArrayList<Student> students) {
        Student[] res = new Student[9];

        String[] names = { "Dan", "Agnes", "Diana", "Gloria", "Mark", "Steven", "Charles", "Daniel", "Catherine" };
        float[] gpas = { 3.5f, 2.3f, 3.8f, 3.5f, 2.0f, 1.3f, 2.7f, 3.0f, 3.9f };

        for (int i = 0; i < names.length; i++) {
            students.add(new Student(names[i], gpas[i]));
        }
    }

    // Call this function whenever your want to check the state of
    // the ArrayList
    public static void check(ArrayList<Student> students) {
        System.out.println("===========CHECKING===========");
        if (students.isEmpty()) {
            System.out.println("ARRAYLIST IS EMPTY...");
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("=========END CHECKING=========");
    }

    public static void main(String[] args) {
        // Initialize ArrayList
        ArrayList<Student> ListOfStudents = new ArrayList<>();
        // Add to ArrayList
        // ListOfStudents.add(new Student("Eun Sik", 2.0f));

        fillStudents(ListOfStudents);

        ListOfStudents.add(2, new Student("Eun Sik", 2.0f));

        // Read item in ArrayList
        System.out.println(ListOfStudents.get(2));

        // Edit item in ArrayList
        ListOfStudents.get(2).setGPA(4.0f);

        // Remove by object
        ListOfStudents.remove(ListOfStudents.get(2));

        // Remove by index
        ListOfStudents.remove(2);

        // Other useful ArrayList functions:
        // size()
        System.out.println(ListOfStudents.size());

        // isEmpty()
        if (ListOfStudents.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }

    }
}
