import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int nu = n.nextInt();
        for(int i =1; i<11; i++ ){
            System.out.printf("%d x %d = %d%n", nu,i, nu*i);
        }
    }
}
