public class Api4 {

    public static void main(String[] args) {
        // 编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
        // “To be or not to be"，将变成"oT eb ro ton ot eb."。
        String str = "To be or not to be";
        String[] arrayStr = str.split(" ");
        StringBuffer flipBuffStr = new StringBuffer();// 定义翻转字符
        for (String sr : arrayStr) {
            StringBuffer buffStr = new StringBuffer(sr);
            flipBuffStr.append(buffStr.reverse()+" ");
        }
        String flipStr=flipBuffStr.toString();
        //最后一个空格用.代替
        String subFlipStr = flipStr.substring(0, flipStr.length()-1);
        String connectSubFlipStr=subFlipStr+".";
        System.out.println("翻转后的字符："+connectSubFlipStr);
    }

}
