class Student{
    private String name;
    private float gpa;
    private int id;
    private static int counter = 854354;

    public Student(){
        this.name = "John";
        this.gpa = 4.0f;
        id = counter++;
    }

    public Student(String name, float gpa){
        this.name = name;
        this.gpa = gpa;
        id = counter++;
    }

    public String getName(){
        return name;
    }
    public float getGPA(){
        return gpa;
    }
    public int getID(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setGPA(float gpa){
        this.gpa = gpa;
    }

    
}

public class ExampleB {
    public static Student[] fillStudents(){
        Student[] res = new Student[9];

        String[] names = {"Dan", "Agnes", "Diana", "Gloria", "Mark", "Steven", "Charles", "Daniel", "Catherine"};
        float[] gpas = {3.5f, 2.3f, 3.8f, 3.5f, 2.0f, 1.3f, 2.7f, 3.0f, 3.9f};

        for(int i = 0; i < names.length; i++){
            res[i] = new Student(names[i], gpas[i]);
        }

        return res;
    }
    public static void main(String[] args) {
        for(Student s : fillStudents()){
            System.out.println(s.getName() + " " + s.getGPA() + " ID: " + s.getID());
        }
    }
}
