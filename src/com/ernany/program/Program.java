package com.ernany.program;

import com.ernany.services.Management;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Management manage = new Management();
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM VINDO!");
        int opcao;
        do {
            System.out.println("1 - Cadastrar user");
            System.out.println("2 - Remover user");
            System.out.println("3 - Listar users");
            System.out.println("4 - Adicionar task");
            System.out.println("5 - Remover task");
            System.out.println("6 - Listar tasks");
            System.out.println("7 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> manage.addUser();
                case 2 -> manage.removeUser();
                case 3 -> manage.listUsers();
                case 4 -> manage.addTask();
                case 5 -> manage.removeTask();
                case 6 -> manage.listTasks();
                case 7 -> System.out.println("PROGRAMA ENCERRADO.");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);

    }
}