package Tratamento_Exceções;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;
//                                                                             try / catch

public class SobreMimExceçoes {
    public static void main(String[] args){

    try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
            
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
    
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
    
        System.out.println("Digite sua altura ");
        double altura = scanner.nextDouble();
    

        System.out.println("Olá me chamo " + nome + " "+ sobrenome);
        System.out.println("tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "metros");
        scanner.close();

             //pegeuei no terminal, depois de dar erro 
    }catch (InputMismatchException e){
    //imput equivocado de dados
    System.out.println("Os campos de idade e altura precisam ser numericos");
    }
    //importante saber que erro esta sendo disparado para o devido tratamento

    }
}
/* try é a tentativa.
 * catch é o que sera feito quando aqule tipo de excessão(erro) acontecer.
 */