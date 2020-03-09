//现有五个学生，每个学生有四门成绩：语文，数学，英语，理科综合
//要求：1.求出平均分最高同学的所有信息
//2.找出理科成绩最高的人
public class Score {
    private String studentName;
    private int chinese;
    private int math;
    private int english;
    private int scienceSynthesis;
    public Score(String studentName, int chinese, int math, int english, int scienceSynthesis) {
        this.studentName = studentName;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.scienceSynthesis = scienceSynthesis;
    }
    public int sumScore() {
        return chinese + math + english + scienceSynthesis;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public void setEnglish(int english) {
        this.english = english;
    }
    public void setScienceSynthesis(int scienceSynthesis) {
        this.scienceSynthesis = scienceSynthesis;
    }

    public String getStudentName() {
        return studentName;
    }
    public int getChinese() {
        return chinese;
    }
    public int getMath() {
        return math;
    }
    public int getEnglish() {
        return english;
    }
    public int getScienceSynthesis() {
        return scienceSynthesis;
    }
    public String toString() {
        return " [名字=" + studentName + ", 语文分=" + chinese + ", 数学分=" + math + ", 英语分=" + english + ", 理科综合分=" + scienceSynthesis + "]";


    }
}