package Tratamento_Exceções;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //Criando o objeto scanner.

        System.out.println("Digite um numero: "); //Aparece na tela(terminal).
        int num1 = scanner.nextInt(); //Pega o que o usuario digitou.


        System.out.println("Digite outro numero:");
        int num2 = scanner.nextInt();
    
        //Usado para informar que foi colocado informação errada no campo.
        try{  //Se tiver certo vai para o metodo contador.
            contador(num1, num2); //Metodo contador, e adiciona as variazeis num.
        }catch(ParamentrosInvalidos e){ //Se o que o usuario colocou estiver errado, vai aparecer a mensagem a baixo.
            System.out.println("O segundo parametro deve ser maior que o primeiro!");
        }
    }

    //          Metodo    /  add as variaveis           
    static void contador(int num1, int num2) throws ParamentrosInvalidos{ //Criando metodo contador.
        if(num1 > num2){ //Se o numero 1 for MAIOR que o numero 2 vai aparecer a mensagem de erro do Catch.
            throw new ParamentrosInvalidos(); 
        }else{ 
            for(int n = num1; n <= num2; n++){ 
            System.out.println("Imprimindo numero: " + n );
            }
        } 
    }
    

}