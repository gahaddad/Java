package Tratamento_Exceções;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {

        try{
            Number valor = NumberFormat.getInstance().parse("al.55");
            System.out.println(valor);
        }catch(ParseException e){
            e.printStackTrace();
            //o método print
        }
    }
    
}
