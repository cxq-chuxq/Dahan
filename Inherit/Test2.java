public class Test2 {
    public static void main(String[] args) {
        Person p = new Student();//new的子类可以用父类来承载，new的父类不可以用子类承载
        p.work();
        p = new Worker();
        p.work();
        StudentLeader stu = new StudentLeader();
        stu.meeting();//子类的方法父类不可调用
    }
}