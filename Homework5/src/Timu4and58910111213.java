public class Timu4and58910111213 {
    public static void main(String[] args) {
        // "我是你的谁,我是你的剑" 判断是否包含 "剑"
        String str = "我是你的谁,我是你的剑";
        if (str.contains("剑")) {
            System.out.println("包含");
        } else {
            System.out.println("不包含");
        }
        // 字符串判断是否以"我"开头
        if (str.startsWith("我")) {
            System.out.println("以\"我\"开头");
        } else {
            System.out.println("不是以\"我\"开头");
        }
        // 判断是否以"剑"结尾
        if (str.endsWith("剑")) {
            System.out.println("以\"剑\"开头");
        } else {
            System.out.println("不是以\"剑\"开头");
        }
        // 题目8：找出 "我是你的谁,我是你的剑" 里面的 "你" 第一次出现的位置
        int location1 = str.indexOf("你");
        System.out.println("\"你\" 第一次出现的位置为：" + location1);
        // 题目9.找到上面 8 题的 最后一次出现 "你" 的位置,然后再从 第4个位置开始找 第一次出现的"你"
        int location2 = str.lastIndexOf("你");
        System.out.println("\"你\" 最后一次出现的位置为：" + location2);
        int location3 = str.indexOf("你", 3);
        System.out.println("第4个位置开始找  第一次出现的\"你\"的位置为：" + location3);
        // 题目10."我是你的谁,我是你的剑" 从指定位置开始截取长度;从指定位置开始截取到指定位置结束长度的字符串
        String str2 = str.substring(2);
        System.out.println("从第2位开始截取的字符串为：" + str2);
        String str3 = str.substring(2, 5);
        System.out.println("从第2位开始截取的，第5位结束的字符串为：" + str3);
        // 题目11" 我是你的谁,我是你的剑 " 去除字符串左右空格
        String newStr = " 我是你的谁,我是你的剑 ";
        String  str4 = newStr.trim();
        System.out.println("\" 我是你的谁,我是你的剑 \" 去除字符串左右空格后为：" + "\"" + str4 + "\"");
        // 题目12"我是你的谁,我是你的剑"  替代字符串里面的"谁",改为"被子"
        String str5 = str.replace("谁", "被子");
        System.out.println("\"我是你的谁,我是你的剑\"  替代字符串里面的\"谁\",改为\"被子\"后为：" + "\"" + str5 + "\"");
        //题目13 "我是你的谁,我是你的剑"  替换该字符串的所有的 "你" 改为 "哈"
        String str6 = str.replaceAll("你", "哈");
        System.out.println("\"我是你的谁,我是你的剑\"  替换该字符串的所有的 \"你\" 改为 \"哈\"后为：" + "\"" + str6 + "\"");
    }

}
