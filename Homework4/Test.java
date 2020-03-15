public class Test {

    public static void main(String[] args) {
        Company company = new Company();
        HourEmployee hourEmployee1 = new HourEmployee();
        hourEmployee1.setHourSalary(10);
        hourEmployee1.setWorkTime(200);
        System.out.println("hourEmployee1的工资为" + hourEmployee1.calculateSalary());
        HourEmployee hourEmployee2 = new HourEmployee();
        hourEmployee2.setHourSalary(10);
        hourEmployee2.setWorkTime(230);
        System.out.println("hourEmployee2的工资为" + hourEmployee2.calculateSalary());
        SaleEmployee SaleEmployee1 = new SaleEmployee();
        SaleEmployee1.setTotalSalesAmount(5000);
        System.out.println("SaleEmployee1的工资为" + SaleEmployee1.calculateSalary());
        SaleEmployee SaleEmployee2 = new SaleEmployee();
        SaleEmployee2.setTotalSalesAmount(200000);
        System.out.println("SaleEmployee2的工资为" + SaleEmployee2.calculateSalary());
        GeneralEmployee generalEmployee = new GeneralEmployee();
        generalEmployee.setWorkTime(205);
        System.out.println("generalEmployee的工资为" + generalEmployee.calculateSalary());
        company.addEmployee("小时工1", hourEmployee1);
        company.addEmployee("小时工2", hourEmployee2);
        company.addEmployee("销售员工1", SaleEmployee1);
        company.addEmployee("销售员工2", SaleEmployee2);
        company.addEmployee("普通员工", generalEmployee);
        double sumSalary = company.sumSalary();
        System.out.println("应发工资总和：" + sumSalary);
        JewelryWorker jewelryWorker = new JewelryWorker();
        jewelryWorker.setProduceNum(30);
        company.addEmployee("首饰工人", jewelryWorker);
        sumSalary = company.sumSalary();
        System.out.println("增加首饰工人类之后，应发工资总和：" + sumSalary);
        company.showSalary("小时工1");
        company.deleteEmployee("小时工1");
        sumSalary = company.sumSalary();
        System.out.println("应发工资总和：" + sumSalary);
    }

}
