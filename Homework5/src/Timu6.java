public class Timu6 {

    public static void main(String[] args) {
        // String str=""和 String str2=null; 判断他们是否为空
        String str = "";
        String str2 = null;
        if (str == null || str.isEmpty()) {
            System.out.println(str + "为空");
        } else {
            System.out.println(str + "不为空");
        }
        if (str2 == null || str2.isEmpty()) {
            System.out.println(str2 + "为空");
        }
    }

}
