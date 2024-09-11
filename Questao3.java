import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Qual o seu nome ? ");
        String nome = n.next();
        for (int i=0 ; i<10; i++) {
            System.out.println(nome);
        }
    }
}
