//1.学生类,学生编号,学生姓名,学生密码,学生成绩
public class Student {
    private int stuNum;// 编号

    private String stuName;// 姓名

    private String stuPassword;// 密码

    private int stuScore;// 成绩

    public Student(int stuNum, String stuName, String stuPassword) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.stuPassword = stuPassword;
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

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }

    public int getStuScore() {
        return stuScore;
    }

    public void setStuScore(int stuScore) {
        this.stuScore = stuScore;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Student) {
            Student s = (Student) obj;
            return this.stuNum == s.stuNum && this.stuName.equals(s.getStuName()) && this.stuPassword.equals(s.stuPassword);
        } else {
            return false;
        }

    }

}
