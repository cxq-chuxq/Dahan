public class Test3 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(4, 400);
        v.dataOut();
        v = new Car(4, 300, 4);
        v.dataOut();
        v = new Truck(8, 5000, 2, 10000);
        v.dataOut();
    }

}
