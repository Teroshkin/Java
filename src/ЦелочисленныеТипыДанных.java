public class ЦелочисленныеТипыДанных {
    public static void main(String[] args){
        System.out.println("1");
        System.out.println("4");
        System.out.println("5");
        System.out.println("2");
        System.out.println("6");
        System.out.println("3");
//        целочисленные примитивные данные в java
//        byte 8 bit    -128...127
//        short 16 bit  -32768...32767
//        int   32 bit -2147483648...2147483647
//        long 64 bit - 9233372036854775808...9233372036854775807
        byte b = 127;

        System.out.println(b);


        short s = -2066;
        System.out.println(s);

        int i = 8888;
        System.out.println(i);

        long l = 999999999999l;
        System.out.println(l);

//        Числа с плавающей точкой
//        float 32 bit 3. 4e-038... 3. 4e+ 038
//        double 64 bit 1. 7e-308... 1. 7e+ 308

        float f = 9999999999999999.9999F;
        System.out.println(f);
        double d = 9e50;
        System.out.println(d);

//        логический тип данных
//        boolean 2 bit true..false
        boolean x = true;
        System.out.println(x);

//        Символьный тип данных
//        char 16 bit '....'

        char ch = 'Ж';
        System.out.println(ch);
    }
}

