
public class exeOperadores {
    public static void main(String[] args){
        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritimetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();

        int numero = 5;
        //Imprimir o numero negarivo
        //System.out.println(-numero);
        numero = - numero;
        numero = numero *-1;
        System.out.println(numero);
    }

    private static void prePos(){
        
        int k = 10;
        int i = ++k; //soma 1 = 11
        int j = k--; //j recebe 11 e o k se transforma em 10 subtrai 1 de 11
        int x = k;

        System.out.println("i: "+ i);
        System.out.println("j: "+ j);
        System.out.println("x: "+ x);
    }

    private static void aritimetico(){
        /*aa */
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("A + B = " + r1);
        System.out.println("C - A = " + r2);
        System.out.println("D * B = " + r3);
        System.out.println("E / A = " + r4);
        System.out.println("C % B = " + r5);
    }

    private static void atribuicao(){
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("D: " +d);

        i += 5; 
        j -= 3;
        d /= 2.7d;
        l *= 3;
        k %= 2;

        i= k =j;

        System.out.println(k);
        System.out.println(i);
        System.out.println(l);
    }

    private static void precedencia(){
        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k ;

        System.out.println("A = i++ = --j * k: " + a);
        System.out.println("i: " + i);

        int b = k / --i % 3+1;

        System.out.println("K/--i%3+1: " + b);
        System.out.println(i);

        int c = 2;

        c *= i += 5;
        System.out.println(c);
    }

}
