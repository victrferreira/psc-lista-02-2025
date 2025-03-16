package Lista02;

import java.util.Scanner;
public class exerci03 {
    public static void main(String[] args) {
        double nota1,nota2,nota3,nota4,media;
        Scanner texto= new Scanner(System.in);
        System.out.println("Seja bem vindo!");
        System.out.print("Digite a nota bimestral 01 aqui:");
        nota1=texto.nextInt();
        System.out.print("Digite a nota bimestral 02 aqui:");
        nota2= texto.nextInt();
        System.out.print("Digite a nota bimestral 03 aqui:");
        nota3=texto.nextInt();
        System.out.print("Digite a nota bimestral 04 aqui:");
        nota4= texto.nextInt();
        media=(nota1+nota2+nota3+nota4)/4;

        System.out.println("A média das notas é:"+media);
        texto.close();

    }
}
