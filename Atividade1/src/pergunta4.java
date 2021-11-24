import java.util.Scanner;

public class pergunta4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String infoPessoas[] = new String[5];
        int altura , idade;


        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Insira a altura e a idade da " + (i + 1) + "º pessoa:");

                System.out.println("Insira a altura da pessoa em números inteiros: ");
                altura = sc.nextInt();
                System.out.println("Insira a idade da pessoa:");
                idade = sc.nextInt();

            infoPessoas[i] = "A pessoa " + (i + 1) + " tem " + idade + " anos, e mede " + altura + " centímetros.";
        }

        for (int i = 4 ; i >= 0 ; i--){
            System.out.println(infoPessoas[i]);
        }
        sc.close();
    }
}
