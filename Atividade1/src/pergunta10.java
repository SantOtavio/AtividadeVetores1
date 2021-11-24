import java.util.Scanner;

public class pergunta10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double respostas[] = new double[5];
        int nivelSuspeito = 0;

        System.out.println("Telefonou para a vítima? (1 = sim, 2= não)");
        respostas[0] = sc.nextDouble();
        if (respostas[0] == 1) {
            nivelSuspeito = nivelSuspeito + 1;
        }

        System.out.println("Esteve no local do crime? (1 = sim, 2= não)");
        respostas[1] = sc.nextDouble();
        if (respostas[1] == 1) {
            nivelSuspeito = nivelSuspeito + 1;
        }

        System.out.println("Mora perto da vítima? (1 = sim, 2= não)");
        respostas[2] = sc.nextDouble();
        if (respostas[2] == 1) {
            nivelSuspeito = nivelSuspeito + 1;
        }

        System.out.println("Devia para a vítima? (1 = sim, 2= não)");
        respostas[3] = sc.nextDouble();
        if (respostas[3] == 1) {
            nivelSuspeito = nivelSuspeito + 1;
        }

        System.out.println("Já trabalhou com a vítima? (1 = sim, 2= não)");
        respostas[4] = sc.nextDouble();
        if (respostas[4] == 1) {
            nivelSuspeito++;
            System.out.println("Assasino");
        } else if (nivelSuspeito == 2) {
            System.out.println("Suspeito");
        } else if (nivelSuspeito > 2 && nivelSuspeito <= 4) {
            System.out.println("Cumplice");
        } else if(nivelSuspeito == 1 || nivelSuspeito == 0){
            System.out.println("Inocente");
        }

        sc.close();
    }

}
