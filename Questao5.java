import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        int [] num = new int[10];
        int soma = 0;
        Scanner n = new Scanner(System.in);
        System.out.println("Digite 10 numeros!");
        for (int i = 0; i<10; i++){
            System.out.println("Digite o "+(i+1)+" numero: ");
            num[i] = n.nextInt();
            soma = soma + num[i];
        }
        System.out.println(soma);
    }
}
