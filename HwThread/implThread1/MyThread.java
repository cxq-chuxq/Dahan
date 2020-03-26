package implThread1;
//有三个线程,输出200到400之间所有的数据,如果是奇数那么就输出当前线程的名称
public class MyThread extends   Thread{
    private static int  number=400;

  public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {

        while(true){

            synchronized (MyThread.class) {
                if ((number>=200&&number<=400)&&(number%2==1)) {
                    System.out.println((number--)+"的线程为"+Thread.currentThread().getName());
                } else if((number>=200&&number<=400)&&(number%2==0)){
                    System.out.println(number--);
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

}


