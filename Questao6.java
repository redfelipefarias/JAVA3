import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        int [] num = new int[20];
        int soma = 0;
        Scanner n = new Scanner(System.in);
        System.out.println("Digite a idade de 20 pessoas!");
        for (int i = 0; i<20; i++){
            System.out.println("Digite a "+(i+1)+" idade: ");
            num[i] = n.nextInt();
            soma = soma + num[i];
        }
        System.out.println(soma);
    }
}
