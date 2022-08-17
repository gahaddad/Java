public class conversoes {
    public static void main(String[] args){

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; //downcast ..resultado -24, perda de informação
        System.out.println(b1);

        long l1;
        int i1 = 10;
        l1 = i1; //=10
        System.out.println(l1);

        int i2;
        long l2 = 1000000000000L;
        i2 = (int) l2;
        System.out.println(i2);

        int i3;
        long l3 = 10000L;
        i3 = (int) l3; //downcast sem perda, pq 10000 cabe no inteiro
        System.out.println(i3);

        double d1;
        float f1 = 10.5f;
        d1 = f1; //upcasts
        System.out.println(d1);

        float f2;
        float f3;
        double d2 = 1000.58d; //downcast caabe dentro do float
        f2 = (float) d2;
        double d3 = 1000.5888888888888888; //houve perda de informação
        f3 = (float) d3;
        System.out.println(f3);

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;
        System.out.println(i4);

    }
}
