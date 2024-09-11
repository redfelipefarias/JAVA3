import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int ct = 0;
        int nu;
        boolean a = true;
        while (a){
            System.out.println("Digite um numero: ");
            nu = m.nextInt();
            if (nu > 0){
                ct = ct+nu;
            }
            else{
                a = false;
            }
        }
        System.out.println(ct);
    }
}
