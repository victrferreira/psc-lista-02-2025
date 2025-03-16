package Lista02;

import java.util.Scanner;
public class exerci01 {
    public static void main(String[] args) {
        int numero;
        Scanner texto = new Scanner(System.in);
        System.out.print("Escreva seu número aqui:");
        numero=texto.nextInt();
        System.out.println("O número informado foi o número:"+numero);
        texto.close();
}
}
