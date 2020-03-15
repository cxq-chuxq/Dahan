public class HourEmployee implements Employee {
    private int workTime;

    private  int hourSalary;
    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public void setHourSalary(int hourSalary) {
        this.hourSalary = hourSalary;
    }

    @Override
    public double calculateSalary() {
        return workTime * hourSalary;
    }
}
