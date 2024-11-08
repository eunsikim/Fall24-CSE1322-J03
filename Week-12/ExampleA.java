class myClass extends Thread {
    private int id;

    public myClass(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread id: " + id + " Print #" + (i + 1));
        }
    }
}

public class ExampleA {

    public static void main(String[] args) {
        myClass m1 = new myClass(1);
        myClass m2 = new myClass(2);
        myClass m3 = new myClass(3);

        m1.start();
        m2.start();
        m3.start();
    }
}