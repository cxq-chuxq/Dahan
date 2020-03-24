import java.io.*;
import java.util.ArrayList;
import java.util.List;

//找到指定文件及其子目录下面的所有的txt文件,并且把满足条件的文件全部读取出来写入到另一个txt文件里面去(使用地柜完成)
public class Io1 {
    public static void main(String[] args) throws IOException {
        List<File> myfile = new ArrayList<File>();
        File dir = new File("/Users/edz/Dahan/File/src");
        // 开始遍历
        getAllFile(dir, myfile);

        System.out.println("目录下包含 " + myfile.size() + "个txt文件：");
        FileOutputStream fos = new FileOutputStream("/Users/edz/Dahan/File/src.txt");
        for (File file : myfile) {
            System.out.println(file.getAbsolutePath());
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            int len;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
            fis.close();
        }
        fos.close();
    }

    private static void getAllFile(File dir, List<File> myfile) {
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getAllFile(f, myfile);
            }
        }
        File[] listFiles = dir.listFiles(new FileFilter() {

            public boolean accept(File pathname) {
                if (pathname.getName().endsWith("txt")) { // txt的文件
                    return true;
                }
                return false;
            }
        });
        for (File f : listFiles) {
            myfile.add(f);
        }
    }
}
