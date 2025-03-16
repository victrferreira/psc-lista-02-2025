package Lista02;
import java.util.Scanner;
public class exerci04 {
    public static void main(String[] args) {
        Scanner texto= new Scanner(System.in);
        double valor, total;
        int litro;

        System.out.println("Seja bem vindo");
        System.out.print("Escreva aqui a quantidade de litros:");
        litro=texto.nextInt();
        System.out.print("Escreva aqui o preço da gasolina:R$");
        valor=texto.nextDouble();

        total=valor*litro;
        System.out.println("O valor total pago é de: R$"+total);

        texto.close();


    }
}
