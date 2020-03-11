1.下面正确的是(B )
public class Pri extends Base {
    static int i = 200;
    public static void main(String argv[]) {
        Pri p = new Pri();
        System.out.println(i);
    }
}
A.编译错误
B.200
C.100 200
D.100

2.下列程序运行结果是(B )。
class Base {
    Base() {
        int i = 100;
        System.out.println(i);
    }
}
public class Pri extends Base {
    static int i = 200;
    public static void main(String argv[]) {
        Pri p = new Pri();
        System.out.println(i);
    }
}
A.编译错误
B.200
C.100 200
D.100

6.如何定义一个不能有子类的类Key(B )。
A.class Key { }
B.final class Key { }
C.public class Key { }
D.class Key {final int I;}

7.哪个选项可以做为以下方法的覆盖方法（A)。
public void add(i nt a) {…}
A.public void add(int b) {…}
B.void add(int a) {…}
C.public int add(int a) {…}
D.public void add(float a) {…}

8.在子类构造方法的哪个地方可以调用超类的构造方法( B)。
A.任何地方
B.构造方法的第一条语句
C.构造方法的最后一条语句
D.不能在子类构造方法中调用超类的构造方法

9.下列程序的运行结果是(C )。
public class Test {
    public static void test() {
        this.print();
    }
    public static void print() {
        System.out.println("Test");
    }
    public static void main(String args []) {
        test();
    }
}
A.输出Test
B.无输出结果
C.类编译错误, 指示不能在static上下文中使用this
D.以上都不对

10.设有如下代码:
1. class Example {
    2. String str;
    3. Example() {
        4. str = "example";
        5.
    }
    6. Example(String s) {
        7. str = s;
        8.
    }
    9.
}
10. class Demo extends Example {
    11.
}
12. public class Test {
    13. public void f () {
        14. Example ex = new Example("Good");
        15. Demo d = new Demo("Good");
        16.
    }
    17.
}
以下哪行将导致错误( D  )。
A.第3行
B.第6行
C.第10行
D.第15行

11.在Java中, 如下的修饰符不是访问控制修饰符( A)。
A.static
B.public
C.protected
D.private

12.试完成下述程序片段(D )。
public class Point {
    int x, y;
    public Point(int x, int y) {
        ( ) = x;
        ( ) = y;
    }
    ...
}
A.Point.x Point.y
B.无解
C.x1 y1
D.this.x this.y

13.在JAVA 中( C)。
A.一个子类可以有多个父类, 一个父类也可以有多个子类
B.一个子类可以有多个父类, 但一个父类只可以有一个子类
C.一个子类只可以有一个父类, 但一个父类可以有多个子类
D.上述说法都不对

14.什么是在子类中创建一个和父类具有一样特征的方法, 特征包括方法名字, 参数个数, 参数类型和方法返回值类型(A )。
A.覆盖(overloading)
B.重载(overriding)
C.继承(inheritance)
D.none

15.哪个关键词在子类中用来访问与父类中一样的方法(A )。
A.super
B.this
C.static
D.以上没有

16.哪个关键词用来引用当前类的对象(B )。
A.super
B.this
C.static
D.以上没有

17.哪个修饰符定义的方法和变量只在定义它们的类中可见, 而在其他的任何类中它们都不可见(C )。
A.protected
B.public
C.private
D.none of the above