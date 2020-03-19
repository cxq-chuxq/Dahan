import java.util.Set;

//1.模拟在校学生选课系统,使用集合完成
//要求：1.学生类:学号，姓名，所选课程Set<Course>
//学生可以对课程做增删改查操作
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Student {
    private String stuId;

    private String stuName;

    private Set<Course> courses = new TreeSet<Course>(new Comparator<Course>() {
        @Override
        public int compare(Course o1, Course o2) {
            int i1 = Integer.parseInt(o1.getCourseNum());
            int i2 = Integer.parseInt(o2.getCourseNum());
            if (i1 > i2) {
                return 1;
            } else if (i1 == i2) {
                return 0;
            } else {
                return -1;
            }
        }
    });

    public Student(String stuId, String stuName) {
        this.stuId = stuId;
        this.stuName = stuName;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Set<Course> getCourses() {
        return courses;
    }


    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Set<Course> insertCourse(Course course) {
        courses.add(course);
        return courses;
    }

    public Set<Course> deleteCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
        } else {
            System.out.println("无此课程,删除失败");
        }
        return courses;
    }

    public Set<Course> updateCourse(Course oldCourse, Course newCourse) {
        if (courses.contains(oldCourse) && !courses.contains(newCourse)) {
            courses.remove(oldCourse);
            courses.add(newCourse);
            return courses;
        } else if (courses.contains(oldCourse) && courses.contains(newCourse)) {
            System.out.println("新课程已选");
            return courses;
        } else {
            System.out.println("旧课程不存在");
            return courses;
        }
    }

    // 学生是否选了这门课
    public boolean selectCourse(Course course) {
        if (courses.contains(course)) {
            return true;
        } else {
            return false;
        }
    }
}
