import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int contador = 0;

        for(int i=0; i<10; i++){
            System.out.println("digite um numero: ");
            int numero = s.nextInt();

            if(numero > 8){
                contador++;
            }
        }

        System.out.printf("existem %d numero(s) maiores que 8!",contador);






    }
}
