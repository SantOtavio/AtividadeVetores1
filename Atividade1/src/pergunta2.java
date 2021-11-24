import java.util.Scanner;

public class pergunta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNotas = 0;
        double mediaAlunos[] = new double[10];
        double contadorPassados = 0 , nota , somanota = 0;

        for (int i = 0 ; i < mediaAlunos.length ; i++){
            System.out.println("Insira as notas do aluno " + (i + 1 ) + "º aluno:");
            for (int n = 1 ; n <= 4 ; n++){
                System.out.println("Insira a " + n + "º" + " nota:");
                nota = sc.nextDouble();
                somanota += nota;
            }
            mediaAlunos[i] = somanota / 4;
            if(mediaAlunos[i] >= 7){
                contadorPassados ++;
            }
        }

        System.out.println("A quantidade de alunos que passaram foi de: " + contadorPassados + " alunos.");
        sc.close();
    }
}
