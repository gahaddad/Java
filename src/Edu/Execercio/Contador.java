package Edu.Execercio;

import java.util.Scanner;
import Tratamento_Exceções.ParamentrosInvalidos;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Criando o metodo scanner

        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt(); // Pega o que o usuario digitou 10


        System.out.println("Digite outro numero:");
        int num2 = scanner.nextInt();
    

        try{
            contador(num1, num2);
        }catch(ParamentrosInvalidos e){
            System.out.println("O segundo parametro deve ser maior que o primeiro!");
        }
    }

   
    static void contador(int num1, int num2) throws ParamentrosInvalidos{
        if(num1 > num2){
            throw new ParamentrosInvalidos();
        }else{
            for(int n = num1; n <= num2; n++){
            System.out.println("Imprimindo numero: " + n );
            }
        } 
    }
    

}