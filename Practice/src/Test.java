//3.学生选课清单类
//完成:有n个人 显示出每个人所选的课程信息
//如：姓名：张三:    所选课程如下： 9527  java基础 ，9768 C# ，9898 javaScript 等
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Course course1 = new Course("1", "java基础");
        Course course2 = new Course("2", "C#");
        Course course3 = new Course("3", "javaScript");
        Course course4 = new Course("4", "python");
        Map<String, Course> courseMap = new HashMap<>();
        courseMap.put(course1.getCourseNum(), course1);
        courseMap.put(course2.getCourseNum(), course2);
        courseMap.put(course3.getCourseNum(), course3);
        courseMap.put(course4.getCourseNum(), course4);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        String stuId = sc.next();
        System.out.println("请输入姓名：");
        String stuName = sc.next();
        Student stu = new Student(stuId, stuName);
        System.out.println("所有课程编号如下(每人选3门课)");
        System.out.println(courseMap.keySet().toString());
        for (int i = 0; i < 3; i++) {
            System.out.println("请选择第" + (i + 1) + "门课的编号：");
            String num = sc.next();
            if (courseMap.keySet().contains(num) && stu.selectCourse(courseMap.get(num))) {
                System.out.println("已选该课程,请重新输入");
                i = i - 1;
                continue;
            }
            if (!courseMap.keySet().contains(num)) {
                System.out.println("所选课程不存在,请重新输入");
                i = i - 1;
            } else {
                stu.insertCourse(courseMap.get(num));
            }
        }
        // 删除课程
        System.out.println("请选择要删除课程的编号");
        String delNum = sc.next();
        if (!courseMap.keySet().contains(delNum)) {
            System.out.println("所选课程不存在,删除失败");
        } else {
            stu.deleteCourse(courseMap.get(delNum));
        }
        // 更新课程
        System.out.println("请选择要修改课程的编号");
        String updOldNum = sc.next();
        System.out.println("请选择修改后课程的编号");
        String updNewNum = sc.next();
        if (!courseMap.keySet().contains(updOldNum)) {
            System.out.println("要修改课程不存在,更新失败");
        } else if (!courseMap.keySet().contains(updNewNum)) {
            System.out.println("修改后课程不存在,更新失败");
        } else {
            stu.updateCourse(courseMap.get(updOldNum), courseMap.get(updNewNum));
        }
        System.out.println("姓名[" + stu.getStuName() + "] 所选课程如下：" + stu.getCourses());
        sc.close();
    }
}
