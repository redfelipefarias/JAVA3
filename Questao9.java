import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int menor = 1000;
        String menorNome = "";

        for (int i = 0; i<10; i++){
            System.out.print("me diga o nome: ");
            String nome = s.next();
            System.out.print("me diga a idade: ");
            int idade = s.nextInt();
            if (idade < menor){
                menor = idade;
                menorNome = nome;
            }
        }
        System.out.printf("A menor idade é a do: %d",menorNome) ;

    }
}