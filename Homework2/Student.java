public class Student {
    private int stuNum;//编号

    private String stuName;//姓名

    private String stuGrade;//年级

    private int stuScore;//成绩

    public Student() {
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade;
    }

    public int getStuScore() {
        return stuScore;
    }

    public void setStuScore(int stuScore) {
        this.stuScore = stuScore;
    }

    @Override
    public String toString() {
        return "[学生编号=" + stuNum + ", 学生姓名=" + stuName + ", 年级=" + stuGrade + ", 成绩=" + stuScore + "]";
    }
}