#第二次练习  
```
1.在HashSet集合中添加三个Person对象，把姓名相同的人当做同一个人，禁止重复添加
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        Person other = (Person) obj;
        return other.name.equals(this.name);
    }
}
public class Test {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person p1 = new Person("Tom", 19);
        Person p2 = new Person("Bob", 20);
        Person p3 = new Person("Jack", 21);
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        for (Object obj : hashSet) {
            Person p = (Person) obj;
            System.out.println(p.name + ":" + p.age);
        }
    }
}
```

```
2.选择合适的Map集合保存5位学员的学号和姓名，然后按学号的自然顺序的倒序将这些键值对一一打印出来
public class Test {
    public static void main(String[] args) {
        TreeMap map = new TreeMap(new MyComparator());
        map.put("1", "Lucy");
        map.put("2", "Lucy");
        map.put("3", "John");
        map.put("4", "Smith");
        map.put("5", "Amanda");
        for (Object key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}

class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String str1 = String.valueOf(obj1);
        String str2 = String.valueOf(obj2);
        return str2.compareTo(str1);
    }
}
```
```$xslt
3.请使用LinkedList来模拟一个队列(先进先出的特性)
3.1 拥有放入对象的方法void put(Object o)
3.2 取出对象的方法Object get()
3.3 判断队列当中是否为空的方法booleanisEmpty()；并且，编写测试代码，验证你的队列是否正确？
public class Test {
    public static void main(String[] args) {
        DuiLie dl = new DuiLie();
        dl.put("a");
        dl.put("b");
        dl.put("c");
        while (!dl.isEmpty()) {
            //获取第一个元素
            Object o = dl.get();
            System.out.println(o);
        }
    }

    static class DuiLie {
        LinkedList<Object> list = new LinkedList<>();
        public boolean isEmpty() {
            if (list.size() == 0) {
                return true;
            } else {
                return false;
            }
        }
        public void put(Object o) {
            list.add(o);
        }
        public Object get() {
            Object obj = list.getFirst();
            list.removeFirst();
            return obj;
        }
    }
}

```
```$xslt
4.创建线程的两种方式分别是什么？各有什么优缺点？
方式1：继承Java.lang.Thread类，并覆盖run() 方法。
     优势：编写简单；
     劣势：单继承的限制----无法继承其它父类，同时不能实现资源共享。
方式2：实现Java.lang.Runnable接口，并实现run()方法。
     优势：可继承其它类，多线程可共享同一个Thread对象；
     劣势：编程方式稍微复杂，如需访问当前线程，需调用Thread.currentThread()方法
```
```$xslt
5.请你简述sleep( )和wait( )有什么区别？
对于sleep()方法，我们首先要知道该方法是属于Thread类中的。
而wait()方法，则是属于Object类中的。
sleep()方法导致了程序暂停执行指定的时间，让出cpu该其他线程，但是他的监控状态依然保持者，当指定的时间到了又会自动恢复运行状态。
在调用sleep()方法的过程中，线程不会释放对象锁。
而当调用wait()方法的时候，线程会放弃对象锁，进入等待此对象的等待锁定池，只有针对此对象调用notify()方法后本线程才进入对象锁定池准备
获取对象锁进入运行状态。
```

```$xslt
6.Java中实现线程通信的三个方法及其作用？
1、传统的线程通信。
 在synchronized修饰的同步方法或者修饰的同步代码块中使用Object类提供的wait(),notify()和notifyAll()3个方法进行线程通信。
2、使用Condition控制线程通信。
当程序使用Lock对象来保证同步，系统不存在隐式的同步监视器，只能用Condition类来控制线程通信。
3、使用阻塞队列（BlockingQueue）控制线程通信（也实现了生产者消费者模式）
  BlockingQueue提供如下两个支持阻塞的方法：
    put(E e):尝试把E元素放入BlockingQueue中，如果该队列的元素已满，则阻塞该线程。
    take():尝试从BlockingQueue的头部取出元素，如果该队列的元素已空，则阻塞该线程。
```
```$xslt
7.现在有线程 T1、T2 和 T3。你如何确保 T2 线程在 T1 之后执行，并且 T3 线程在 T2 之后执行？
Thread 类的 join 方法实现
```
```$xslt
8.Java 中新的 Lock 接口相对于同步代码块（synchronized block）有什么优势？如果让你实现一个高性能缓存，支持并发读取和单一写入，你如何保证数据完整性。
Lock接口在多线程和并发编程中最大的优势是它们分别为读和写提供了锁。
    使用读写锁ReentrantReadWriteLock，
    它表示有两个锁，一个是读操作相关的锁，也称为共享锁；
    另一个是写操作相关的锁，也叫排他锁。“读写”、“写读”、和 “写写“ 都是互斥的；而 ”读读“ 是异步的，非互斥的
    即：多个线程可以同时进行读取操作，但是同一时刻只允许一个线程进行写入操作。
```
```$xslt
9.Java 中 wait 和 sleep 方法有什么区别？
对于sleep()方法，我们首先要知道该方法是属于Thread类中的。
而wait()方法，则是属于Object类中的。
sleep()方法导致了程序暂停执行指定的时间，让出cpu该其他线程，但是他的监控状态依然保持者，当指定的时间到了又会自动恢复运行状态。
在调用sleep()方法的过程中，线程不会释放对象锁。
而当调用wait()方法的时候，线程会放弃对象锁，进入等待此对象的等待锁定池，只有针对此对象调用notify()方法后本线程才进入对象锁定池准备
获取对象锁进入运行状态。
```
```$xslt
10.如何在 Java 中编写代码解决生产者消费者问题
生产者、消费者是两个实体对象，生产者生产物品，消费者消费物品。
如果在生产者中定义生产的流程，在消费者中定义消费的流程，两个对象就需要彼此引用，这样依赖性太高，而且实际上性能也不高，
这个时候就需要一个缓冲器，一个中间对象，我们把它形象地称之为“仓库”。
生产的物品放入仓库，消费的物品从仓库中取出，这样生产者和消费者就能够取消两者之间的引用，直接通过仓库引用来同步状态，降低耦合。
可以看到，引入仓库还是很有必要的。
接着我们来看一下生产者、消费者问题的两种类型，
一种是使用某种机制来保护生产者和消费者之间的同步，另一种则与Linux中的管道思路相似。
相对来说第一种类型的处理方式更为常规，
实现方式大致分为三种：经典的wait(),notify()方法、await(),signal()方法以及使用阻塞队列(BlockingQueue)的方法。
```
```$xslt
11.写一段死锁代码。你在 Java 中如何解决死锁？
public class DeadLockThread extends Thread {
    private final Lock lock1;
    private final Lock lock2;

    public DeadLockThread(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized (lock1) {
            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + "先拿" + lock1.getName() + "，然后尝试获取锁" + lock2.getName());
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + "获取到锁" + lock2.getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
public class DeadLockTest {

    public static void main(String[] args) {
        Lock lock1 = new Lock("[锁1]");
        Lock lock2 = new Lock("[锁2]");

        Thread thread1 = new DeadLockThread(lock1, lock2);
        thread1.setName("<线程1>");
        Thread thread2 = new DeadLockThread(lock2, lock1);
        thread2.setName("<线程2>");
        thread1.start();
        thread2.start();
    }
}
死锁的真正原因不是多线程，而是它们请求锁定的方式。 如果提供有序访问，则死锁问题将得到解决。
顺序获取锁,线程依次执行或检测到死锁，强制中断其中一个线程。
```
```$xslt
12.什么是原子操作？Java 中有哪些原子操作
所谓原子操作是指不会被线程调度机制打断的操作；这种操作一旦开始，就一直运行到结束，

```
```$xslt
13.既然 start() 方法会调用 run() 方法，为什么我们调用 start() 方法，而不直接调用 run() 方法
调用 start() 方法时，它会新建一个线程然后执行 run() 方法中的代码。如果直接调用 run() 方法，并不会创建新线程，方法中的代码会在当前调用者的线程中执行

```
#第三次练习  
```$xslt
1.分别写出一个静态代理和动态代理案例,并且对比一下两者的不同
public interface Dog {
     void eat();
}
public class BlackDog implements Dog {
    @Override
    public void eat() {
        System.out.println("小黑");
    }
}
public class StaticHandler implements Dog {
 
    private Dog dog;
 
    public StaticHandler(Dog dog){
        this.dog = dog;
    }
    @Override
    public void eat() {
        dog.eat();
    }
}
public class Client {
 
    public static void main(String[] args) {
        BlackDog blackDog = new BlackDog();
        Dog dog = new StaticHandler(blackDog);
        dog.eat();
    }
}
public interface Dog {
 
     void eat();
}
public class WhiteDog implements Dog{
    @Override
    public void eat() {
        System.out.println("白狗吃骨头");
    }
}
public class ProxyHandler implements InvocationHandler {
 
    private Object dog;
 
    public ProxyHandler(Object dog){
        this.dog = dog;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(dog,args);
    }
}
public class Test {
 
    public void testProxy(){
 
        WhiteDog whiteDog = new WhiteDog();
        Dog dog = (Dog) Proxy.newProxyInstance(Dog.class.getClassLoader(),
                new Class[]{Dog.class},new ProxyHandler(whiteDog));
        dog.eat();
 
 
    }
 
    public static void main(String[] args) {
        Test t = new Test();
        t.testProxy();
    }
}
静态代理类：由程序员创建或由特定工具自动生成源代码，再对其编译。在程序运行前，代理类的.class文件就已经存在了。
动态代理类：在程序运行时，运用反射机制动态创建而成。

```
```$xslt
2.写出恶汉模式，懒汉模式，线程安全的懒汉模式
public class SingletonLhAQ {
    //线程安全
    private static SingletonLhAQ instance;

    private SingletonLhAQ() {
    }
    public static synchronized SingletonLhAQ getInstance() {
        if (instance == null) {
            instance = new SingletonLhAQ();
        }
        return instance;
    }
}
public class SingletonLh {
    //懒汉模式
    //将构造函数私有化
    private SingletonLh() {

    }

    //将对象实例化
    private static volatile SingletonLh instance;

    //得到实例的方法

    public static SingletonLh getInstance() {
        if (instance == null) {
            synchronized (SingletonLh.class) {
                if (instance == null) {
                    instance = new SingletonLh();
                }
            }
        }
        return instance;
    }
}

public class SingletonEh {
    //饿汉模式
    //将构造函数私有化
    private SingletonEh(){

    }
    //将对象实例化
    private static SingletonEh instance = new SingletonEh();

    //得到实例的方法

    public static SingletonEh getInstance() {
        return instance;
    }
}

```
```$xslt
3.写出二分查找以及快速排序的算法,并且用自己的话总结其原理
public class TiMu3 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 23, 34, 45, 56, 67, 77, 89, 90};
        System.out.println(search(arr, 12));
    }

    public static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (key < arr[middle]) {
                end = middle - 1;
            } else if (key > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}

```
```$xslt
4.写出选择排序以及原理
import java.util.Arrays;

public class TiMu4 {
        public static void main(String[] args) {
            int [] arr = {49,38,65,97,76,13,27,49};
            selectSort(arr,arr.length);
        }
        public static void selectSort(int [] arr,int n){
            for (int i = 0; i < n - 1; i++) {
                int index = i;
                int j;
                // 找出最小值得元素下标
                for (j = i + 1; j < n; j++) {
                    if (arr[j] < arr[index]) {
                        index = j;
                    }
                }
                int tmp = arr[index];
                arr[index] = arr[i];
                arr[i] = tmp;
                System.out.println(Arrays.toString(arr));
            }
        }
}
```
```$xslt
5.Java中List<?>和List之间的区别是什么？ava中List和原始类型List之间的区别？
List：是原始类型，因此不是typesafe。仅在转换不良时才会生成运行时错误。当强制转换错误时，我们需要一个编译时错误。不建议使用。
List<?>是一个无界通配符。但是我不确定它是做什么用的,里面是不确定类型

```
```$xslt
6.Java中synchronized 和 ReentrantLock 有什么不同？
区别一：API层面
syschronized使用
synchronized即可修饰方法，也可以修饰代码块。
区别二：等待可中断
区别三：公平锁
公平锁是指多个线程在等待同一个锁时，必须按照申请的时间顺序来依次获得锁；而非公平锁则不能保证这一点。非公平锁在锁被释放时，任何一个等待锁的线程都有机会获得锁。 synchronized的锁是非公平锁，ReentrantLock默认情况下也是非公平锁，但可以通过带布尔值的构造函数要求使用公平锁。
区别四：绑定多个条件
 ReentrantLock可以同时绑定多个Condition对象，只需多次调用newCondition方法即可。
synchronized中，锁对象的wait和notify() 或notifyAll()方法可以实现一个隐含的条件。但如果要和杜宇一个的条件关联的时候就不得不额外添加一个锁。
区别五：性能
JDK 1.5中，synchronized还有很大的优化余地。JDK 1.6 中加入了很多针对锁的优化措施，synchronized与ReentrantLock性能方面基本持平。虚拟机在未来的改进中更偏向于原生的synchronized。
```
```$xslt
7.并发编程的三要素
原子性，可见性，有序性
```
```$xslt
8.CyclicBarrier和CountDownLatch的区别，CountDownLatch这个已经上过，要求自己学习CyclicBarrier并且写出代码
CountDown表示减法计数，Latch表示门闩的意思，计数为0的时候就可以打开门闩了。
Cyclic Barrier表示循环的障碍物。两个类都含有这一个意思：对应的线程都完成工作之后再进行下一步动作，也就是大家都准备好之后再进行下一步。
然而两者最大的区别是，进行下一步动作的动作实施者是不一样的。
这里的“动作实施者”有两种，一种是主线程（即执行main函数），另一种是执行任务的其他线程，后面叫这种线程为“其他线程”，区分于主线程。
对于CountDownLatch，当计数为0的时候，下一步的动作实施者是main函数；对于CyclicBarrier，下一步动作实施者是“其他线程”。
```
```$xslt
9.ThreadLocal学习以及案例上传
1.initialValue函数 : initialValue函数用来设置ThreadLocal的初始值,该函数在调用get函数的时候会第一次调用，但是如果一开始就调用了set函数，则该函数不会被调用。
2.get函数：该函数用来获取与当前线程关联的ThreadLocal的值，如果当前线程没有该ThreadLocal的值，则调用initialValue函数获取初始值返回。
3.set函数： set函数用来设置当前线程的该ThreadLocal的值。
4.remove函数：remove函数用来将当前线程的ThreadLocal绑定的值删除。
ThreadLocal底层原理：
JDK8的ThreadLocal的get方法的源码:
public T get() {
        Thread t = Thread.currentThread();
        ThreadLocalMap map = getMap(t);
        if (map != null) {
            ThreadLocalMap.Entry e = map.getEntry(this);
            if (e != null) {
                @SuppressWarnings("unchecked")
                T result = (T)e.value;
                return result;
            }
        }
        return setInitialValue();
    }
设计思路：每个Thread维护一个ThreadLocalMap映射表，这个映射表的key是ThreadLocal实例本身，value是真正需要存储的Object。
ThreadLocal底层深入：
ThreadLocalMap是使用ThreadLocal的弱引用作为Key的。
```
```$xslt
10.ConcurrentHashMap和Hashtable的区别？
HashMap
底层数组+链表实现，可以存储null键和null值，线程不安全
初始size为16，扩容：newsize = oldsize*2，size一定为2的n次幂
扩容针对整个Map，每次扩容时，原来数组中的元素依次重新计算存放位置，并重新插入
插入元素后才判断该不该扩容，有可能无效扩容（插入后如果扩容，如果没有再次插入，就会产生无效扩容）
当Map中元素总数超过Entry数组的75%，触发扩容操作，为了减少链表长度，元素分配更均匀
计算index方法：index = hash & (tab.length – 1)
ConcurrentHashMap
底层采用分段的数组+链表实现，线程安全
通过把整个Map分为N个Segment，可以提供相同的线程安全，但是效率提升N倍，默认提升16倍。(读操作不加锁，由于HashEntry的value变量是 volatile的，也能保证读取到最新的值。)
Hashtable的synchronized是针对整张Hash表的，即每次锁住整张表让线程独占，ConcurrentHashMap允许多个修改操作并发进行，其关键在于使用了锁分离技术
有些方法需要跨段，比如size()和containsValue()，它们可能需要锁定整个表而而不仅仅是某个段，这需要按顺序锁定所有段，操作完毕后，又按顺序释放所有段的锁
扩容：段内扩容（段内元素超过该段对应Entry数组长度的75%触发扩容，不会对整个Map进行扩容），插入前检测需不需要扩容，有效避免无效扩容
```
#cglib动态代理
```$xslt
1.cglib 动态代理 上传到git 明天检查 找出 jdk 动态代理和 cglib 动态代理的不同
DK动态代理只能对实现了接口的类生成代理，而不能针对类
CGLIB是针对类实现代理，主要是对指定的类生成一个子类，覆盖其中的方法（继承）
```
```$xslt
2.使用jdk给指定的程序添加额外的功能

```
```$xslt
3.写出一个线程安全的单例模式
public class SingleDemo {
  private static   SingleDemo  singleDemo=new SingleDemo();
    private   SingleDemo(){
    }
    public  static   SingleDemo  getInstance(){
      return singleDemo;
    }
}

class  MyThread2 extends  Thread{
  @Override
  public void run() {
    System.out.println(SingleDemo.getInstance().hashCode());

  }
}

class  Test{

  public static void main(String[] args) {

    MyThread2 myThread1=new MyThread2();
    MyThread2 myThread2=new MyThread2();
    myThread1.start();
    myThread2.start();
  }
}

```