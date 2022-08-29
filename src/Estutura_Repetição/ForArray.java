package Estutura_Repetição;
public class ForArray {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        //x=0, pq o array(indice) inicia em zero, length = tamanho
        for (int x=0; x < alunos.length; x++){
            System.out.println("O aluno do índice i= " + x + " é " + alunos[x]);
        }

    }
}
