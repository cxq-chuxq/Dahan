import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class exam {

    public static void main(String[] args) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生编号:");
        stu.setStuNum(sc.nextInt());
        System.out.println("请输入姓名:");
        stu.setStuName(sc.next());
        System.out.println("请输入年级:");
        stu.setStuGrade(sc.next());
        List<TestPaper> testList = new ArrayList<>();
        for (int i = 1; i < 31; i++) {
            TestPaper testPaper = new TestPaper(i, "题目" + i + "()", "A.1" + "\n" + "B.2" + "\n" + "C.3" + "\n" + "D.4", "A");
            testList.add(testPaper);
        }
        Random randomId = new Random();
        int count = 0;
        String anwser = "";
        while (testList.size() > 20) {//选随机10道题给学生
            count++;
            int num = randomId.nextInt(testList.size());//0-29的任意随机数
            TestPaper testP = testList.get(num);
            anwser = anwser + testP.getAnwser();//anwser为10道题正确答案连接起来的字符串
            System.out.println(count + "." + testP.toString());
            testList.remove(num);
        }
        System.out.println("请输入10道题的答案(请用大写的ABCD回答,例如：AABBCCDDAD)");
        String stuAnwser = sc.next();//学生作答的10道题的答案
        int okLen = 0;
        for (int i = 0; i < 10; i++) {//将学生的答案与标准答案对比，相同的计数加1
            char c1 = anwser.charAt(i);
            char c2 = stuAnwser.charAt(i);
            if (c1 == c2) {
                okLen++;
            }
        }
        stu.setStuScore(okLen * 10);
        System.out.println("您的成绩为：" + okLen * 10);
        System.out.println("学生信息：" + stu);
        sc.close();
    }
}