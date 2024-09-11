import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int numpar = 0;
        for (int i = 0 ;i < 20; i++){
            System.out.println("Digite um número: ");
            int nu = n.nextInt();
            if (nu % 2 == 0){
                numpar++;
            }
        }
        System.out.printf("existem %d numeros pares",numpar);
    }

}
