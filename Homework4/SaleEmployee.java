public class SaleEmployee implements Employee {
    private int totalSalesAmount;
    private int basicSalary = 2000;
    public void setTotalSalesAmount(int totalSalesAmount) {
        this.totalSalesAmount = totalSalesAmount;
    }

    @Override
    public double calculateSalary() {
        if (totalSalesAmount < 10000) {
            return basicSalary + totalSalesAmount * 0.1;
        } else if (totalSalesAmount >= 10000 && totalSalesAmount <= 100000) {
            return basicSalary + totalSalesAmount * 0.15;
        } else {
            return basicSalary + totalSalesAmount * 0.18;
        }
    }

}
