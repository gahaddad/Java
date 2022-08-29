package Estutura_Repetição;

import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do{
            //executa repetidas vezes ate alguem atender
            System.out.println("Telefone tocando");

        }while(tocando());
        System.out.println("Alô!!!");
    }

    private static boolean tocando(){ //metodo tocando randomico
        boolean atendeu = new Random().nextInt(bound: 3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negado o ato de continuar tocando
        return ! atendeu;
    }
    
}
