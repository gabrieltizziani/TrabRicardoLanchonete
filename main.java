package TrabLanchonete;

import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;

        System.out.println("===Olá Bem Vindo a GM Lanches===");
        System.out.print("Qual é o seu nome: ");
        String nome = scanner.next();
        System.out.println("Olá " + nome + " aqui está nossas opções: ");
        System.out.println("1. Ver cardápio ");
        System.out.println("2. Fazer pedidos ");
        System.out.println("3. Ver pedidos ");
        System.out.println("4. Entrega ");
        System.out.println("5. Avaliar ");
        System.out.println("Faça sua escolha: ");
        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
            Lanchonete.ExibirCardapio();

        }



    }




}

