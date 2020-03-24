import java.io.*;

//创建a/test.txt文件并在其中输入"hello world",创建一个输入流读取该文件中的文本,并且把小写的l变成大写L再利用输出流写入到b/test.txt中
public class Io3 {
    public static void main(String[] args) {
            new File("a").mkdir();
            new File("b").mkdir();
            File file = new File("a/test.txt");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            String str = "hello world";
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            for (byte b : str.getBytes()) {
                try {
                    fos.write(b);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            File file2 = new File("b/test.txt");
            if (!file2.exists()) {
                try {
                    file2.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file2));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String newContent = null;
        try {
            newContent = br.readLine().replace("l", "L");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bw.write(newContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
