public class Variavel{
     public static void main(String[] args){
    
        byte idade = 22;
        short ano = 2022;
        int cep = 14025180; //se começar com zero, talvez tenha que ser outro tipo
        long cpf = 49307301808L; //se começar com zero, talvez tenha que ser outro tipo. Colocar o L no final
        float pi = 3.14F; //float colocar o F no final
        double salario = 1500.33;
    
        System.out.println ("idade " + idade);
        System.out.println ("ano " + ano);
        System.out.println ("cpf " + cpf);
        System.out.println(salario);
        
        System.out.println();
        /*variavel numero com valor 5 regra: tipo + nome + valor*/
        int numero = 5;
        /*na linha abaixo iremos alterar o valor da variavel para 10, 
        observe que o tipo não é mais necessario, pois a variavel foi declarada anteriormente*/
        numero = 10;
        System.out.println(numero);


        /*final double VALOR_DE_PI = 3.14;
        VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação
        */
    }
}

