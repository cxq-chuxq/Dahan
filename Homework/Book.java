public class Book {
    private String title;
    private int pageNum;

//做个判断：判断页数是否满足条件
//页数不能少于200页，否则输出错误信息
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPageNum(int pageNum) {
        if (pageNum >= 200) {
            this.pageNum = pageNum;
        } else {
            System.out.println("错误，页数不能少于200");
            this.pageNum = 200;
        }
    }
    public String getTitle() {
        return title;
    }
    public int getPageNum() {
        return pageNum;
    }
    public void detail() {
        System.out.println(getTitle());
        System.out.println(getPageNum());
    }
}