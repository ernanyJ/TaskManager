package com.ernany.services;

import com.ernany.entities.Endereco;
import com.ernany.entities.Task;
import com.ernany.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {
    private List<User> userList = new ArrayList<>();
    private List<Task> taskList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addUser() {
        System.out.println("Qual nome do usuário?");
        String username = sc.nextLine();
        System.out.println("Insira o país: ");
        String userCountry = sc.nextLine();
        System.out.println("Insira a rua: ");
        String userStreet = sc.nextLine();
        System.out.println("Insira o número: ");
        int userNumber = sc.nextInt();
        sc.nextLine();
        Endereco end = new Endereco(userStreet, userCountry, userNumber);
        User newUser = new User(username, end);
        userList.add(newUser);
        System.out.println("User cadastrado: ");
        System.out.println(newUser.getName() + ":" + newUser.getId());
    }

    public void removeUser() {
        System.out.println("Insira o ID do usuário a ser removido: ");
        Integer id = sc.nextInt();
        for (User x : userList) {
            if (id.equals(x.getId())) {
                userList.remove(x);
                break;
            } else {
                System.out.println("Usuário não encontrado.");
            }
        }
    }

    public void listUsers() {
        for (User x : userList) {
            System.out.println(x);
        }
    }


    public void addTask() {
        System.out.println("Insira o ID do usuário: ");
        Integer id = sc.nextInt();
        sc.nextLine();
        for (User x : userList) {
            if (id.equals(x.getId())) {
                System.out.println("Insira o nome da task: ");
                String taskName = sc.nextLine();
                Task task = new Task(taskName);
                x.tasks.add(task);
                if (!id.equals(x.getId())) {
                    System.out.println("Usuário não encontrado.");
                }
            }
        }
    }

    public void removeTask() {
        System.out.println("Insira o ID do usuário: ");
        Integer id = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira o nome da task: ");
        String taskName = sc.nextLine();
        for (User x : userList) {
            int i = 0;
            if (id.equals(x.getId()) && x.tasks.get(i).getTaskName().equals(taskName)) {
                x.tasks.remove(i);
            }
            i++;
        }
    }

    public void listTasks() {
        System.out.println("Insira o ID do usuário: ");
        Integer id = sc.nextInt();
        sc.nextLine();
        for (User x : userList) {
            if (x.getId().equals(id)) {
                System.out.println(x.getTasks());
            }
        }
    }

}