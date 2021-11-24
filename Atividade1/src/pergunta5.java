import java.util.Scanner;

public class pergunta5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        int contadorPar = 0, contadorInpar = 0;
        for (int i = 0 ; i < num.length ; i++){
            System.out.println("Insira o " + (i + 1) + " número: ");
            num[i] = sc.nextInt();
        }

        int multiplicacao[] = new int[10];
        int soma = 0;

        for (int i = 0 ; i < num.length ; i++){
            multiplicacao[i] = num[i] * num[i];
        }

        for (int i = 0 ; i < num.length ; i++){
            soma += multiplicacao[i];
        }

        System.out.println("Números somados: ");

        System.out.println(soma);

        sc.close();
    }
}
