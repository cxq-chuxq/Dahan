import java.util.ArrayList;

//请编写程序将本班各位同学成绩从高往低排序打印输出，
// 注：成绩相同时学号较小的优先打印要求：打印的信息包含学号、姓名（姓名统一为“同学 J”[J=10,11,12。。。]）和成绩
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


public class Test2 {

    public static void main(String[] args) {
        List<Student> stuList = new ArrayList<>();
        for (int i = 180201; i <= 180240; i++) {
            Student stu = new Student();
            stu.setNum(180201);
            stu.setName("同学" + i);
            Random r = new Random();
            int score = r.nextInt(51) + 50;
            stu.setScore(score);
            stuList.add(stu);
        }
        Collections.sort(stuList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() < o2.getScore()) {
                    return 1;
                } else if (o1.getScore() == o2.getScore()) {
                    if (o1.getNum() < o2.getNum()) {
                        return 1;
                    } else if (o1.getNum() > o2.getNum()) {
                        return -1;
                    } else {
                        return 0;
                    }
                } else {
                    return -1;
                }
            }
        });
        System.out.println(stuList.toString());
    }
}
