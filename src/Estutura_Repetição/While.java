package Estutura_Repetição;

//import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
    
        double mesada = 50.0;

        while (mesada>0){

            Double valorDoce = 100.0;//valorAleatorio();

            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce de valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;    
        }
        System.out.println("Mesada " + mesada);
        System.out.println("João gastou toda sua mesada em doce");
}

    /*private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(origin 2, bound 8);
    }*/
    
}
