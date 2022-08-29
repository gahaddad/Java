package Tratamento_Exceções;

public class FormartarCep {
    public static void main(String[] args) {
    //criando a classe de exceção
    try {
        String cepFormatado = formatarCep("14025180");
        System.out.println(cepFormatado);
    } 
    catch (CepInvalido e) {
        System.out.println("o cep não corresponde as regras");
        e.printStackTrace();
    }
    }
/*O fato de eu querer usar o formartarCep ja exige que eu use o try catch
pq ela é uma expeption, não é um erro, mas uma exceção*/

    //criando ometodo de formatação
    static String formatarCep(String cep) throws CepInvalido{
        if(cep.length()!=8)
        //se for diferente de 8 lança exceção
            throw new CepInvalido(); //aqui a condição que ele ira lançar
            return "14.025-180"; //simulando um cep formatado
    }
}
