public class BalançoTrimestral {
    public static void main(String[] args){
        int despesasJaneiro = 11000;
        int despesasFevereiro = 22000;
        int despesasMarco = 15000;

        int despesasTrimestral = despesasFevereiro+despesasJaneiro+despesasMarco;
        int mediaPorMes = despesasTrimestral/3;

        System.out.println("Gastos de trimestre: R$" + despesasTrimestral);
        System.out.println("Média Mensal: R$" + mediaPorMes);
    }
}
