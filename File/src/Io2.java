import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

//利用字节流或者换成字节流的方式以指定的格式输入数据 如:xxx,xxx,xxx,最后一个数据以 .号结束，一行最多五个数据
public class Io2 {
    public static void main(String[] args) {
        File file = new File("/Users/edz/Dahan/File/src/test2.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("一号");
        arrayList.add("二号");
        arrayList.add("三号");
        arrayList.add("四号");
        arrayList.add("五号");
        arrayList.add("六号");
        try(FileOutputStream fil = new FileOutputStream(file);){

            for (int i = 0; i <arrayList.size() ; i++) {
                if(i!=0&&(i+1)%5==0){
                    String str = (arrayList.get(i)+"。"+"\n");

                    fil.write(str.getBytes());
                }else{
                    String str = arrayList.get(i) + "，";

                    fil.write(str.getBytes());
                }

            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
