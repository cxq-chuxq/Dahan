public class GeneralEmployee implements Employee {
    private int workTime;
    private int basicSalary = 3000;
    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public double calculateSalary() {
        if (workTime > 196) {
            return basicSalary + (workTime - 196) * 200;
        } else {
            return basicSalary;
        }
    }

}
