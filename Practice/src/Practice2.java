//某班级有 40 个学生，学号为 180201-180240，全部参加 Java 集合阶段检测，给出所有同学的成绩（可随机产生，范围为 50-100），

public class Practice2 {
    private int num;

    private String name;

    private int score;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return  name + "[编号为" + num + "]" + "成绩为[" + score + "]"+"\n";
    }


}
