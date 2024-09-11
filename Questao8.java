import java.sql.SQLOutput;
import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int [] num = new int[20];
        int maior = 0;
        System.out.println("Digite a idade de 20 pessoas: ");
        for (int i=0 ; i <20 ;i++){
            System.out.println("Digite a "+(i+1)+" idade: ");
            num[i] = n.nextInt();
            if (num[i] >= 18){
                maior = maior + 1;
            }
        }
        System.out.println("Tem "+maior+" idades maiores que 18.");
    }
}
