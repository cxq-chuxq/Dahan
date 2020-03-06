class Basic {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        a = b++;
        c = --a;
        b = ++a;
        a = c--;
        System.out.println("a=" + a + ",b=" + b + ",c=" + c);
        /*
            a=9
            b=10
            c=8
        */
        int x = 4;
        int y = (x++) + (++x) + (x * 10);
        System.out.println("x=" + x + ",y=" + y);
        /*
            x=6
            y=70
        */
        byte b = 10;
        b++;
        b = b + 1;
        System.out.println(b);
        /*
            报错
        */
        public static void main(String[] args) {
            int i = 0;
            test(i);
            i = ++i;
            System.out.println("----" + i);
            i = i++;
            System.out.println("****" + i);
        }

        public static void test(int i) {
            i++;
            System.out.println("++++" + i);
        }
        /*
            ++++1
            ----1
            ****1
        */
        int x = 5, y = 6, z;
        A.z = ++x + y++;
        B.z = ++x + x++;
        C.x = ++x + x++；
        D.z = x > y ? ++x : y++;
        /*
            A.x=6;y=7;z=12
            B.x=7;y=6;z=12
            C.x=12;y=6;z=0
            D.x=5;y=7;z
        */
        String a = "aa";
        int c = 555;
        String b = a + "bbb" + c;
        double d = 5.66600;
        int e = (int) d;
        int f = 3;
        double g = 3.53;
        float h = 1.7f;
        int i = 1;
        System.out.println(b);
        System.out.println(e);
        System.out.println( f / i );
        System.out.println( g / f);
        System.out.println( h / f );
        System.out.println(  9.5 < 8 );
        System.out.println( (int)'a' +  (int)'z' );
        System.out.println("A~Z：" + ((int)'A') + "~" + ((int)'Z'));
        System.out.println("'A' < 'a':" + ('A' < 'a'));
        /*
            aabbb555
            5
            3
            1.1766666666666665
            0.56666666
            false
            219
            A~Z:65~90
            'A'<'a':true
        */
        System.out.println(6 & 3);
        System.out.println(6 & 2);

        System.out.println(6 | 3);
        System.out.println(6 | 2);

        System.out.println(6 ^ 3);
        System.out.println(6 ^ 2);

        System.out.println(~6);
        /*
            2;2;7;6;5;4;-7
        */
        Int count = 0;
        For(int i = 0; i < 100; i++) {
            count = count++;
        }
        /*
            0
        */

    }
}