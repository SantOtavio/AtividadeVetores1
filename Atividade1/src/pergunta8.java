import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class pergunta8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alturaAlunos[] = new int[30];
        int idadeAlunos[] = new int[30];
        int somaAltura = 0, mediaAltura;
        int qtd_students_short = 0;

        for (int i = 0 ; i < 30 ; i++){
            System.out.println("Insira a idade do aluno:");
            idadeAlunos[i] = sc.nextInt();

            System.out.println("Agora insira a altura do aluno: ");
            alturaAlunos[i] = sc.nextInt();

            somaAltura += alturaAlunos[i];
        }
        mediaAltura = somaAltura / alturaAlunos.length;

        for (int i = 0 ; i < 30 ; i++){
            if (idadeAlunos[i] > 13){
                if (alturaAlunos[i] < mediaAltura);
                qtd_students_short++;
            }
        }

        System.out.println(qtd_students_short + " aluno(s), tem a altura menor que a média de alturas.");
    }
}
