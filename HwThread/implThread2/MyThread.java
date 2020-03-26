package implThread2;
//现在有一个旅行队10个人,探险进入一线天,这个一线天每次只能过一个人,每个人过的时间是20秒,现在10个人通过该一线天,请输出每个人经过一线天的顺序和姓名
public class MyThread extends   Thread {
    private static int number = 10;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {

            synchronized (implThread1.MyThread.class) {
                if (number>0) {
                    System.out.println(Thread.currentThread().getName()+"第"+(number--)+"个进");
                } else {
                    break;
                }
            }
//放到锁里会出现重复，放到外面没办法间隔20s
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


