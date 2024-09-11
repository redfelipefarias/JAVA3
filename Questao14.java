import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int ct = 0;
        int ct2 = 0;
        int ct3 = 0;
        System.out.println("Digite 20 números.");
        for (int i = 0; i<20; i++){
            System.out.println("Digite um número: ");
            int nu = n.nextInt();
            if (nu > 0 && nu<100){
                ct++;
            }
            else if (nu > 101 && nu < 200) {
                ct2++;
            }
            else if (nu >= 200) {
                ct3++;
            }
        }
        System.out.printf("Existem um total de %d número(s) entre 0 e 100.%n",ct);
        System.out.printf("Existem um total de %d número(s) entre 101 e 200.%n",ct2);
        System.out.printf("Existem um total de %d número(s) maiores que 200.%n",ct3);
    }
}