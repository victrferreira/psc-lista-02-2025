package Lista02;

import java.util.Scanner;

public class exerci05 {
    public static void main(String[] args) {
        Scanner texto =new Scanner(System.in);
        int pessoas;
        double valor1, valor2, valor3, total;

        System.out.println("Seja bem vindo");
        System.out.print("Escreva aqui a quantidade de pessoas que irão viajar:");
        pessoas=texto.nextInt();

        System.out.print("Escreva o valor da viagem para Alemanha:R$");
        valor1=texto.nextDouble();

        System.out.print("Escreva o valor da viagem para Portugal:R$");
        valor2=texto.nextDouble();

        System.out.print("Escreva o valor da viagem para Itália:R$");
        valor3=texto.nextDouble();

        total= pessoas*(valor1+valor2+valor3);

        System.out.print("O valor total da viagem é:R$"+total);


        texto.close();


    }
}
