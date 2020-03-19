import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test9 {
    public static void main(String[] args) {
        List<Stu> stuList = new ArrayList<Stu>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加的学生数");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            Stu stu = new Stu("学生" + (i + 1));
            stu.setNum(i + 1);
            stuList.add(stu);
        }
        System.out.println("此时学生库为:" + stuList.toString());
        System.out.println("提示：后续操作的学生编号超出学生库已有的编号，否则会报错");
        System.out.println("按任意键进行指令操作");
        while (sc.hasNext()) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("请输入指令(增，删，改，查)");
            String command = sc2.next();
            switch (command) {
                case "增":
                    // 增
                    System.out.println("请输入要增加的学生姓名");
                    String addName = sc2.next();
                    Stu addStu = new Stu(addName);
                    addStu.setNum(stuList.size() + 1);
                    stuList.add(addStu);
                    System.out.println("此时学生库为:" + stuList.toString());
                    break;
                case "删":
                    // 删除
                    System.out.println("请输入要删除的学生编号");
                    int delNum = sc2.nextInt();
                    Stu delStu = stuList.get(delNum - 1);
                    delStu.setName(null);
                    System.out.println("此时学生库为:" + stuList.toString());
                    break;
                case "改":
                    // 改
                    System.out.println("请输入要修改的编号");
                    int updNum = sc2.nextInt();
                    Stu updStu = stuList.get(updNum - 1);
                    System.out.println("请输入要修改的名字");
                    String updName = sc2.next();
                    updStu.setName(updName);
                    System.out.println("此时学生库为:" + stuList.toString());
                    break;
                case "查":
                    // 查询
                    System.out.println("请输入要查询的学生编号");
                    int selNum = sc2.nextInt();
                    Stu selStu = stuList.get(selNum - 1);
                    System.out.println(selStu);
                    System.out.println("此时学生库为:" + stuList.toString());
                    break;
            }
        }
    }

}
