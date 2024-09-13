class Person {
    private String name;

    public Person() {
        this.name = " ";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void doAction() {
        System.out.println("This " + name + " is performing an action");
    }
}

class Student extends Person {
    double GPA;
    String degree;

    public Student() {
        super();
        this.GPA = 0.0;
        this.degree = "N/A";
    }

    public Student(String name, double GPA, String degree) {
        super(name);
        this.GPA = GPA;
        this.degree = degree;
    }

    @Override
    public void doAction() {
        System.out.println("Student " + getName() + " enrolled in a " + degree + " is studying.");
    }
}

class Professor extends Person {
    String department;

    public Professor() {
        super();
        this.department = "N/A";
    }

    public Professor(String name, String department) {
        super(name);
        this.department = department;
    }

    @Override
    public void doAction() {
        System.out.println("Professor " + getName() + " from " + department + " is grading.");
    }
}

public class ExampleA {
    public static void main(String[] args) {
        Student s1 = new Student("Eun Sik", 2.6, "Master's degree in Software Engineering");
        Professor p1 = new Professor("John", "Department of Software Engineering and Game Development");

        s1.doAction();
        p1.doAction();
    }
}