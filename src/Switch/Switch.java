package Switch;

public class Switch {
    public static void main(String[] args) {
        
        String plano = "M";//T,M,B

        switch (plano){
            case "T":{
                System.out.println("100 minutos de ligação");
                break; //Se não colocar o break ele continua lendo
            }
            case "M":{
            System.out.println("Whats e Instagram gratis");
            }
            case "B":{
                System.out.println("50b Youtube");
            }
        }

    } 
}
