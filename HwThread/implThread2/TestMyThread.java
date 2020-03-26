package implThread2;

public class TestMyThread {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("游客1");
        MyThread myThread2 = new MyThread("游客2");
        MyThread myThread3 = new MyThread("游客3");
        MyThread myThread4 = new MyThread("游客4");
        MyThread myThread5 = new MyThread("游客5");
        MyThread myThread6 = new MyThread("游客6");
        MyThread myThread7 = new MyThread("游客7");
        MyThread myThread8 = new MyThread("游客8");
        MyThread myThread9 = new MyThread("游客9");
        MyThread myThread10 = new MyThread("游客10");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
        myThread6.start();
        myThread7.start();
        myThread8.start();
        myThread9.start();
        myThread10.start();
    }
}
