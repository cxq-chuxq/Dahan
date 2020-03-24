import java.io.*;

//在程序中创建一个Student类型的对象，并把对象信息保存到/io/student.txt文件中，然后再从文件中把Student对象的信息读出,并且把读出来的数据重新赛给一个对象,然后显示在控制台上
public class Io4 {
    public static void main(String[] args) {
            Student s1 = new Student(1, "张三");
            Student s2 = new Student(2, "李四");
            FileOutputStream fos = null;
            BufferedOutputStream bout = null;
            PrintWriter pw = null;
            new File("Users/edz/Dahan/File/src/io").mkdir();
            File f=new File("Users/edz/Dahan/File/src/io/student.txt");
            if (!f.exists()) {
                try {
                    f.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        try {
            fos = new FileOutputStream( f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        bout = new BufferedOutputStream(fos);
            pw = new PrintWriter(bout);
            pw.println(s1);
            pw.flush();
            pw.println(s2);
            pw.flush();
            pw.close();
            if (bout != null) {
                try {
                    bout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            FileReader fr = null;
            BufferedReader br = null;
        try {
            fr = new FileReader("F:/student.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        br = new BufferedReader(fr);
        String str = null;
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (str != null)// 读取一行
            {
                System.out.println(str);
                try {
                    str = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

