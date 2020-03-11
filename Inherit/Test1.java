//编写一个测试类，对以上两个类进行测试，创建一个长方体，定义其长、宽、高，输出其底面积和体积
public class Test1 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(2.0, 3.0, 4.0);
        System.out.println("底面积为：" + cuboid.area());
        System.out.println("体积为：" + cuboid.volume());
    }
}