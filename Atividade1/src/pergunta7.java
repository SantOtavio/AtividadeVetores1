import java.util.Scanner;
public class pergunta7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double element1[] = new double[10];
        double element2[] = new double[10];
        double element3[] = new double[10];

        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Insira um número para o elemento 1:");
            element1[i] = sc.nextDouble();
        }

        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Insira um número para o elemento 2:");
            element2[i] = sc.nextDouble();
        }

        for (int i = 0; i<10 ; i++){
            System.out.println("Insira um número para o elemento 3:");
            element3[i] = sc.nextDouble();
        }


        for (int i = 0 ; i< 10 ; i++){
            System.out.println(element1[i]);
            System.out.println(element2[i]);
            System.out.println(element3[i]);
        }
    }
}