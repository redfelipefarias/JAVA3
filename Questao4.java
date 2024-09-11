import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = n.next();
        System.out.println("Digte em números quantas vezes quer que repita o nome ? ");
        int q = n.nextInt();
        for (int i=0 ; i< q ; i ++){
            System.out.println(nome);
        }
    }
}
