import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Company {
    private Employee[] employeeArray = new Employee[0];

    private List<Employee> allEmployee = new ArrayList<>(Arrays.asList(employeeArray));

    private Map<String, Employee> allEmployeeMap = new HashMap<>();// 定义存放员工的信息Map,

    public void addEmployee(String name, Employee employee) {
        allEmployee.add(employee);
        allEmployeeMap.put(name, employee);
    }
    public void deleteEmployee(String name) {
        for (String employeeName : allEmployeeMap.keySet()) {
            if (Objects.equals(name, employeeName)) {
                allEmployee.remove(allEmployeeMap.get(name));
                allEmployeeMap.remove(name);
                System.out.println("删除员工成功");
                return;
            }
        }
        System.out.println("无此员工");
    }

    public void showSalary(String name) {
        for (String employeeName : allEmployeeMap.keySet()) {
            if (Objects.equals(name, employeeName)) {
                System.out.println("该员工【" + employeeName + "】的工资为：" + allEmployeeMap.get(employeeName).calculateSalary());
                return;
            }
        }
        System.out.println("无此员工");
    }

    public double sumSalary() {
        double sumSalay = 0;
        for (Employee e : allEmployee) {
            sumSalay = sumSalay + e.calculateSalary();
        }
        return sumSalay;
    }
}
