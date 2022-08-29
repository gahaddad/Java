package Edu.Execercio;

import java.util.Scanner;
import java.util.Stack;
import Tratamento_Exceções.ParamentrosInvalidos;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt()

        System.out.println("Digite outro numero: ");
        int num2 = scanner.nextInt();

        try{

        }catch(ParamentrosInvalidos e){
            System.out.println("o Segundo parametro deve ser maior que o primeito");
            e.printStackTrace();
        }
    
    
    static String contador(String num) throws ParamentrosInvalidos{
        
        if(num1<num2){
            
            throw new ParamentrosInvalidos();
            return "num";
        }else{
            for(int x = 0; x < num2; x++){
            continue;
        }
            
    }
    
}
