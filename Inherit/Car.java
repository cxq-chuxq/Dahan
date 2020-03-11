public class Car extends Vehicle {
    private int loader;
    public Car(int wheels, int weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }
    public int getLoader() {
        return loader;
    }
    public void setLoader(int loader) {
        this.loader = loader;
    }
    public void dataOut() {
        System.out.println("小车类");
        System.out.println("车轮个数" + super.getWheels() + "个");
        System.out.println("车重" + super.getWeight() + "kg");
        System.out.println("有载人数" + loader + "人");
    }
}
