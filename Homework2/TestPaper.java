public class TestPaper {
    private int number;//试题编号

    private String title;//内容

    private String option;//选项

    private String anwser;//答案

    public TestPaper(int number, String title, String option, String anwser) {
        super();
        this.number = number;
        this.title = title;
        this.option = option;
        this.anwser = anwser;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return title + "\n" + option;
    }
}