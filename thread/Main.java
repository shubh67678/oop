class A implements Runnable {
    public void run() {// mandatory
        for (int i = 0; i < 5; i++) {
            System.out.println("Batch-A");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class B implements Runnable {
    public void run() {// mandatory
        for (int i = 0; i < 5; i++) {
            System.out.println("Batch-B");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Thread threadA = new Thread(new A());
        Thread threadB = new Thread(new B());
        threadA.start();
        threadB.start();
    }
}
