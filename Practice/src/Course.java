//2.课程类：编号 课程名称
public class Course {
    private String courseNum;

    private String courseName;

    public Course(String courseNum, String courseName) {
        this.courseNum = courseNum;
        this.courseName = courseName;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    @Override
    public String toString() {
        return courseNum+"  "+courseName;
    }

}
