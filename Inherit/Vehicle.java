public class Vehicle {
    private int wheels;
    private int weight;
    public Vehicle(int wheels, int weight) {
        this.wheels = wheels;
        this.weight = weight;
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void dataOut() {
        System.out.println("汽车类");
        System.out.println("车轮个数" + wheels + "个");
        System.out.println("车重" + weight + "kg");
    }
}
