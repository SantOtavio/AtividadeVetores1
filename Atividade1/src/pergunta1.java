import java.util.Scanner;

public class pergunta1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[20];
        int contadorPar = 0, contadorInpar = 0;
        for (int i = 0 ; i < num.length ; i++){
            System.out.println("Insira o " + (i + 1) + " número: ");
            num[i] = sc.nextInt();
            if (num[i] % 2 == 0){
                contadorPar++;
            }
            else{
                    contadorInpar++;
            }
        }

        int vetorPar[] = new int[contadorPar] , vetorInpar[] = new int[contadorInpar];
        int IPAR = 0, IINPAR = 0;

        for (int i = 0 ; i < num.length ; i++){
            if (num[i] % 2 == 0){
                vetorPar[IPAR] = num[i];
                IPAR++;
            }
            else{
                vetorInpar[IINPAR] = num[i];
                IINPAR++;
            }
        }
        System.out.println("Números digitados: ");
        for (int i = 0 ; i < num.length ; i++){
            System.out.println(num[i]);
        }

        System.out.println("Números pares: ");
        for (int i = 0 ; i < contadorPar ; i++){
            System.out.println(vetorPar[i]);
        }

        System.out.println("Números inpares: ");
        for (int i = 0 ; i < contadorPar ; i++){
            System.out.println(vetorInpar[i]);
        }
        sc.close();
    }
}
