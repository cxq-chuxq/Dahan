public class Truck extends Car {
    private int payload;
    public Truck(int wheels, int weight, int loader, int payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }
    public int getPayload() {
        return payload;
    }
    public void setPayload(int payload) {
        this.payload = payload;
    }
    public void dataOut() {
        System.out.println("卡车类");
        System.out.println("车轮个数" + super.getWheels() + "个");
        System.out.println("车重" + super.getWeight() + "kg");
        System.out.println("有载人数" + super.getLoader() + "人");
        System.out.println("有载重量" + payload + "kg");
    }
}
