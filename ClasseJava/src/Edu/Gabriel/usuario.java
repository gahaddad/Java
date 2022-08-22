public class usuario{
    public static void main(String[] args){

        SmartTv smartTv = new SmartTv();
            System.out.println("Tv ligada? " + SmartTv.ligada);

            System.out.println(smartTv.canal);
            smartTv.mudarCanal(novocanal:13);
            System.out.println("canal Atual: " + SmartTv.canal);

            System.out.println(smartTv.volume);
            //imprime o estado atual da TV
            SmartTv.diminuirVolume();
            SmartTv.diminuirVolume();
            SmartTv.diminuirVolume();
            SmartTv.aumentarVolume();
            System.out.println("Volume Atual  " + SmartTv.volume);

            smartTv.ligar();
            System.out.println("Novo status: " + SmartTv.ligada);

            smartTv.ligar();
            System.out.println("Novo status: " + SmartTv.ligada);
    }

}