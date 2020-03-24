import java.io.File;
import java.io.FilenameFilter;

//找到指定文件夹下面的所有的满足 .java 文件
public class Io5 {
    public static void main(String[] args) {
        File   file=new File("/Users/edz/Dahan");
        String [] strFile= file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.endsWith(".java")){  //满足条件的文件
                    return  true;
                }
                return false;
            }
        });

        for (String   st: strFile) {
            System.out.println(st);
        }
    }
}
