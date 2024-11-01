class myClass implements Runnable {
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
        Thread t1 = new Thread(new myClass(1));
        Thread t2 = new Thread(new myClass(2));
        Thread t3 = new Thread(new myClass(3));
        
        t1.start();
        t2.start();
        t3.start();
    }
}