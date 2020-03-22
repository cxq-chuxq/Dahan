//3.现有两个数据存储容器,存储学生和存储考试试题,学生需要登录考试系统才能进行考试,每答对一题加十分,如果答错没有分
//现在有一个学生进行考试,请在控制台输出这个学生的考试成绩
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        List<Student> stuList = new ArrayList<>();// 存储学生的容器
        List<TestPaper> testList = new ArrayList<>();// 存储考试试题的容器
        // 出试题
        for (int i = 1; i < 11; i++) {
            TestPaper testPaper = new TestPaper(i, "题目" + i + "()", "A.1" + "\n" + "B.2" + "\n" + "C.3" + "\n" + "D.4", "A");
            testList.add(testPaper);
        }
        // 录入学生
        Student stu1 = new Student(1, "学生1", "111111");
        Student stu2 = new Student(2, "学生2", "222222");
        Student stu3 = new Student(3, "学生3", "333333");
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);

        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        while (!flag) {
            System.out.println("请输入学生编号:");
            int num = sc.nextInt();
            System.out.println("请输入姓名:");
            String name = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();
            Student inputStu = new Student(num, name, password);
            if (stuList.contains(inputStu)) {
                flag = true;
                System.out.println("登录成功，请答题");
                for (TestPaper t : testList) {
                    System.out.println(t);
                }
                System.out.println("请输入试题的答案(请用连续ABCD作答)");
                String stuAnwser = sc.next();// 学生作答的题的答案
                int okLen = 0;
                for (int i = 0; i < testList.size(); i++) {// 将学生的答案与标准答案对比，相同的计数加1
                    String c1 = testList.get(i).getAnwser();
                    String c2 = stuAnwser.substring(i, i + 1);
                    if (Objects.equals(c1, c2)) {
                        okLen++;
                    }
                }
                inputStu.setStuScore(okLen * 10);
                System.out.println("您的成绩为：" + okLen * 10);
            } else {
                System.out.println("输入信息有误,请重新输入");
            }
        }
        sc.close();
    }
}
