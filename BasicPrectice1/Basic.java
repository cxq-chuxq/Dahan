class Basic {
    public static void main(String args[]) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数：");
        int c = sc.nextInt();
        System.out.println(a + b + c);



        int a = Inter.parseInt("BCD", 16);
        int b = Inter.parseInt("2F", 16);
        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.toHexString(a + b));




        int a = 0b10011101;
        System.out.println(String.format("%1$x", c));
        System.out.println(String.format("%1$o", c));







        int price = 8; // 先计算出原价
        double realPrice = price * 8 / 10; //再计算出打折之后的价格
        System.out.println(realPrice);




        int i = 1, j; //
//            float f1=0.1;  // 错
        float f1 = 0.1f;
        float f2 = 123; //f
//            long  l1=123141L,l2=88888888888; // 错
        long  l1 = 123141L, l2 = 88888888888L;
        double d1 = 2e20, d2 = 124;
//            byte b1=1,b2=2,b3=129; // 错
        byte b1 = 1, b2 = 2, b3 = 127; //(-128~127)
        j = j + 10;
        i = i / 10;
//           i=i*0.1; // 错
        i = (int)(i * 0.1);
        char c1 = 'a';
        char  c2 = 125;
//            byte b=b1-b2; // 错
        int b = b1 - b2;
//            char c=c1+c2-1;   // 错
        int c = c1 + c2 - 1;
        float f3 = f1 + f2;
//            float f4=f1+f2*0.1;// 错
        double f4 = f1 + f2 * 0.1;
        double d = d1 * i + j;
        float f = (float)(d1 * 5 + d2);



        int aa = 2, bb = 3, cc;
        cc = aa;
        aa = bb;
        bb = cc;
        System.out.println("" + aa"" + bb);
        aa = aa + bb;
        bb = aa - bb;
        aa = aa - bb;
        System.out.println("" + aa + "" + bb);
        aa = aa ^ bb;
        bb = bb ^ aa;
        aa = aa ^ bb;
        System.out.println(" " + aa + " " + bb);





        int a = 9 / 3;
        int b = 9 % 2;
        System.out.println(a); 3
        System.out.println(b); 1
        /*
            a=3
            b=1
        */



        //        float a = 2.1; //错
        float a = 2.1f;
//        float b = (double)20.9; //错
        float b = (float)20.9;
//        int b3 = 210.9f +2.51; //错
        double b3 = 210.9f + 2.51;
        int b4 = (int)20.9 + (int)2.51;//对





        System.out.println("输入一个A~Z的字符");
        String  x = sc.nextLine();
        x = x + 32;
        System.out.println(x);
    }
}