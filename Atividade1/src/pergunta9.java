import java.util.Scanner;

public class pergunta9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mes1 = "Janeiro", mes2 = "Fevereiro", mes3 = "Março", mes4 = "Abril", mes5 = "Maio", mes6 = "Junho", mes7 = "Julho", mes8 = "Agosto", mes9 = "Setembro", mes10 = "Outubro", mes11 = "Novembro", mes12 = "Dezembro";
        double temperaturaMes[] = new double[12];
        double somaTemperaturas = 0 , mediaAnualTemp;

        for (int i = 0 ; i < 12 ; i++){
            System.out.println("Insira a temperatura média do mês " + (i + 1) + " :");
            temperaturaMes[i] = sc.nextDouble();
            somaTemperaturas += temperaturaMes[i];
        }
        mediaAnualTemp = somaTemperaturas / temperaturaMes.length;

        System.out.println("Meses com a temperatura acima da média:");
        for (int i = 0 ; i < 12 ; i++){
            if (temperaturaMes[i] > mediaAnualTemp){
                switch (i){
                    case 0:
                        System.out.println("Janeiro");
                        break;
                    case 1:
                        System.out.println("Fevereiro");
                        break;
                    case 2:
                        System.out.println("Março");
                        break;
                    case 3:
                        System.out.println("Abril");
                        break;
                    case 4:
                        System.out.println("Maio");
                        break;
                    case 5:
                        System.out.println("Junho");
                        break;
                    case 6:
                        System.out.println("Julho");
                        break;
                    case 7:
                        System.out.println("Agosto");
                        break;
                    case 8:
                        System.out.println("Setembro");
                        break;
                    case 9:
                        System.out.println("Outubro");
                        break;
                    case 10:
                        System.out.println("Novembro");
                        break;
                    case 11:
                        System.out.println("Dezembro");
                        break;
                }
            }
        }
    }
}
