public class JewelryWorker implements Employee {
    private int produceNum;
    public void setProduceNum(int produceNum) {
        this.produceNum = produceNum;
    }

    @Override
    public double calculateSalary() {
        return produceNum * 50;
    }

}
