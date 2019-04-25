package br.com.digitalhouse.Integrador;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Livro livro1 = new Livro("A0001","JAVA PARA INICIANTES","JESSICA",2017,2,"999999999-9", 24.99);
        Livro livro2 = new Livro("A0002","ANDROID PARA INICIANTES","TAIRO",2016,5,"888888888-8", 24.99);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addLivro(livro1);
        biblioteca.addLivro(livro2);

        Scanner in = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("Selecione uma operacao");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Consultar Livro");
            System.out.println("3 - Venda Livro");
            System.out.println("4 - Sair");
            try {
                opcao = Integer.parseInt(in.nextLine());
                if (opcao > 0 && opcao < 4) {
                    processar(opcao,biblioteca);

                } else if (opcao > 4) {
                    System.out.println("Opção inválida!");
                    opcao = -1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida!");
                opcao = -1;
            }
        }

    }

    public static void processar(int opcaoSelecionada,Biblioteca biblioteca){
        System.out.println(opcaoSelecionada);

        switch (opcaoSelecionada) {
            case 1:
                System.out.println("---- Cadastrar Livro ----");
                biblioteca.cadastrarLivro();
                break;
            case 2:
                System.out.println("---- Consultar Livro ----");
                biblioteca.consultarLivro();
                break;
            case 3:
                System.out.println("---- Venda Livro ----");
                biblioteca.venderLivro();
                break;
        }
    }
}
