import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int ct = 0;
        System.out.println("Digite 20 números.");
        for (int i = 0; i<20; i++){
            System.out.println("Digite um número: ");
            int nu = n.nextInt();
            if (nu > 0 && nu<100){
                ct++;
            }
        }
        System.out.printf("Existem um total de %d número(s) entre 0 e 100.",ct);
    }
}
