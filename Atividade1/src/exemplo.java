import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalNotas = 0;

        System.out.println("Quantas notas serão inseridas? ");
        int qtdNotas = sc.nextInt();

        double notas[] = new double[qtdNotas];

        for (int i = 0 ; i < notas.length ; i++){
            System.out.println("Insira a nota " + i + " :");
            notas[i] = sc.nextDouble();
            totalNotas += notas[i];
        }
        
       double media = totalNotas / notas.length;

        for (int i = 0 ; i < notas.length ; i++){
            System.out.println((i + 1) + "º nota: " + notas[i]);
        }

        System.out.println("A média é: " + media);
        sc.close();
    }
}
