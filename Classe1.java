import java.util.*;

public class Classe1 {
    public static void main(String[] args) {
        Scanner scnInputUsuario = new Scanner(System.in);//serve para criar o input de entrada via terminal do usuario
        System.out.println("Bem vindo a calculadora de Java.Digite o primeiro número a ser somado e tecle: \"Enter\"");
        int intInputUsuario1 = scnInputUsuario.nextInt();
        System.out.println("Bem vindo a calculadora de Java.Digite o segundo número a ser somado e tecle: \"Enter\"");
        int intInputUsuario2 = scnInputUsuario.nextInt();
        System.out.println("Digite o numero da opção desejada e tecle \"Enter\".");
        String[] opcoes = Classe2.mostrarOpcoes();

        for (int count = 0; count < opcoes.length; count++) {
            System.out.println(count + " - " + opcoes [count]);
        }
        int opcaoEscolhida = scnInputUsuario.nextInt();
       
        System.out.println("O resultado da : " +opcoes[opcaoEscolhida]+ "é" + Classe2.resultado(intInputUsuario1, intInputUsuario2,opcaoEscolhida));
        scnInputUsuario.close();
    }
}