import java.util.Scanner;

public class pergunta6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10],
                vetor2 = new int[10],
                vetorAlt = new int[20];

        System.out.println("Insira 10 valores em cada vetor");
        for (int i = 1; i <= 2; i++) {
            if (i == 1) {
                System.out.println("Vetor 1 --------");
                for (int n = 0; n < vetor1.length; n++) {
                    System.out.print("Valor " + (n + 1) + ": ");
                    vetor1[n] = sc.nextInt();
                }
            } else {
                System.out.println("Vetor 2 --------");
                for (int n = 0; n < vetor2.length; n++) {
                    System.out.print("Valor " + (n + 1) + ": ");
                    vetor2[n] = sc.nextInt();
                }
            }
        }

        int contV1 = 0;
        int contV2 = 0;

        for (int i = 0; i < vetorAlt.length; i++) {
            if (i % 2 == 0) {
                vetorAlt[i] = vetor1[contV1];
                contV1++;
            } else {
                vetorAlt[i] = vetor2[contV2];
                contV2++;
            }
        }

        System.out.println("\nVetor com ordem alternada:");
        for (int i = 0; i < vetorAlt.length; i++) {
            System.out.println(i + 1 + "- " + vetorAlt[i]);
        }

        sc.close();
    }
}