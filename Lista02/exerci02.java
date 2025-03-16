package Lista02;

import java.util.Scanner;
public class exerci02 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        int numero1, numero2, soma, sub, multi;
        int alternativa;

        System.out.println("Seja bem vindo!");
        System.out.print("Escreva o primeiro número aqui:");
        numero1=texto.nextInt();
        System.out.print("Escreva o segundo número aqui:");
        numero2=texto.nextInt();

        soma=numero1+numero2;
        multi=numero1*numero2;
        sub=numero1-numero2;

        System.out.println("Digite 1 para somar\nDigite 2 para subtrair\nDigite 3 para multiplicar");
        alternativa=texto.nextInt();

        if (alternativa==1){
            System.out.println("Resultado de soma="+soma);
        } else if (alternativa==2) {
            System.out.println("Resultado da subtração="+sub);

        } else if (alternativa==3) {
            System.out.println("Resultado da multiplicação="+multi);

        }else {
            System.out.println("");
        }

        texto.close();
    }
}
