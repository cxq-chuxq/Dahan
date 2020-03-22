//2.试题类：试题编号（自增长）,试题名称,试题选项（四个 A B C D）,试题答案
public class TestPaper {
    private int number;// 试题编号

    private String testName;// 试题名称

    private String option;// 选项

    private String anwser;// 答案

    public TestPaper(int number, String testName, String option, String anwser) {
        this.number = number;
        this.testName = testName;
        this.option = option;
        this.anwser = anwser;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getAnwser() {
        return anwser;
    }

    public void setAnwser(String anwser) {
        this.anwser = anwser;
    }
    @Override
    public String toString() {
        return number + "." + testName + "\n" + option;
    }
}
