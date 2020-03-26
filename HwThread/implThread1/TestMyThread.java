package implThread1;
//有三个线程,输出200到400之间所有的数据,如果是奇数那么就输出当前线程的名称
public class TestMyThread {
    public static void main(String[] args) {
        MyThread  myThread1=new MyThread("线程1");
        MyThread  myThread2=new MyThread("线程2");
        MyThread  myThread3=new MyThread("线程3");


        myThread1.start();
        myThread2.start();
        myThread3.start();


    }
}
