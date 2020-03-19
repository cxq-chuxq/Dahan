public class Practice9 {
    private int num;

    private String name;

    public Stu(String name) {
        this.name = name;
    }

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

    public String toString() {
        return "Stu ["+num + ", " + name + "]";
    }

}
