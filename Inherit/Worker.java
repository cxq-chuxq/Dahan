public class Worker extends Person {
    private String unit;
    private int workAge;
    @Override
    public void work() {
        System.out.println("工人的工作是盖房子");
    }
}
