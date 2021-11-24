import java.util.Scanner;

public class pergunta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        int contadorPar = 0, contadorInpar = 0;
        for (int i = 0 ; i < num.length ; i++){
            System.out.println("Insira o " + (i + 1) + " número: ");
            num[i] = sc.nextInt();
        }

        int multiplicacao = 1;
        int soma = 0;

        for (int i = 0 ; i < num.length ; i++){
            multiplicacao *= num[i];
        }

        for (int i = 0 ; i < num.length ; i++){
           soma += num[i];
        }

        System.out.println("Números digitados: ");
        for (int i = 0 ; i < num.length ; i++){
            System.out.println(num[i]);
        }

        System.out.println("Números somados: ");

            System.out.println(soma);


        System.out.println("Números multiplicados: ");

            System.out.println(multiplicacao);

        sc.close();
    }
}
