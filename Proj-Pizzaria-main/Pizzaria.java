package com.senac.pi1.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizzaria {

    private static final List<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        menuPrincipal();
      //  cadastrarCliente();
    }

    private static void menuPrincipal() {
        while (true) {
             System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("A - Fazer pedido");
            System.out.println("B - Lista de pizza");
            System.out.println("C - Cadastrar cliente");
            System.out.println("D - Cadastrar pizza");
            System.out.println("E - Alterar preço");
            System.out.println("F - Controle de pedido");
            System.out.println("G - Listar clientes");
            System.out.println("X - Sair");
            System.out.println();
            System.out.print("Digite a sua escolha: ");
            var escolha = LerDados.lerTexto().toUpperCase();
            System.out.println();

            if (escolha.equals("A")) {
                pedido();
            } else if (escolha.equals("B")) {
                listaPizza();
            } else if (escolha.equals("C")) {
                MenuCliente.cadastrarCliente(clientes);
            } else if (escolha.equals("D")) {
                cadastrarPizza();
            } else if (escolha.equals("E")) {
                alteracaoPreço();
            } else if (escolha.equals("F")) {
                controlePedido();
            } else if (escolha.equals("G")) {
                listarClientes();
            } else if (escolha.equals("X")) {
               return;
            } else {
                System.out.println("Esta não é uma opção válida. Vamos tentar novamente!");
            }
        }
    }


    private static void pedido() {
       // System.out.println("Façer pedido");
       
        
        
        
        
    }

    private static void listaPizza() {
        System.out.println("Não fiz isso ainda. Cenas para os próximos capítulos...");
    }


    private static void cadastrarPizza() {
        System.out.println("Não fiz isso ainda. Cenas para os próximos capítulos...");
    }

    private static void alteracaoPreço() {
        System.out.println("Não fiz isso ainda. Cenas para os próximos capítulos...");
    }

    private static void controlePedido() {
        System.out.println("Não fiz isso ainda. Cenas para os próximos capítulos...");
    }

    private static void listarClientes() {
        for (var c : clientes) {
            System.out.println(c);
        }
    }
}