package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your task manager\n");

        System.out.println("What do you want to do next?");
        System.out.println("1. View Tasks");
        System.out.println("2. Add Task");
        System.out.println("3. Update Task");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");

        System.out.print("\nChoose an option: ");
        int choice =  scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("View Tasks");
                break;
            case 2:
                System.out.println("Add Task");
                break;
            case 3:
                System.out.println("Update Task");
                break;
            case 4:
                System.out.println("Delete Task");
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}