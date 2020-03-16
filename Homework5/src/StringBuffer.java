public class StringBuffer {
    public static void main(String[] args){
        //定义一个StringBuffer类对象，
        //1）使用append方法向对象中添加26个字母，并倒序遍历输入
        //2）删除前五个字符
        StringBuffer str=new StringBuffer();
        for(int i = 97; i < 97 + 26; i++) {
            str.append((char)i);
        }
        str.append((char)i);
        System.out.println("添加之后："+str);
        str.reverse();
        System.out.println("翻转之后："+str);
        str.delete(0,5);
        System.out.println("删除之后："+str);
    }

}
