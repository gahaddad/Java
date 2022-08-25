package Switch;


public class exercicio {
    public static void main(String[] args) {

        int numero = 2;
        //System.out.println("Digite um Numero de 0 a 3: ");
       

        switch(numero){
            case 0: 
                System.out.println("Que pena você perdeu a vez");
                //break;
            case 1:
                System.out.println("Avance 1 case");
                //break;
            case 2:
                System.out.println("Parabensss você ganhou um bonus! Avance 3 casas");
                //break;
            case 3:
                System.out.println("vc é um merda");
                break;
            default:
                System.out.println("Tente novamente");
                //break;
        }
    }
}
