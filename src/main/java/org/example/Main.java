package org.example;

import java.util.Scanner;

public class Main {

    public static int choice;

    static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        System.out.println("What do you want to do next?");
        System.out.println("1. View Tasks");
        System.out.println("2. Add Task");
        System.out.println("3. Update Task");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");

        System.out.print("\nChoose an option: ");
        choice =  scanner.nextInt();
    }

    public static void switchChoice(int choice) {
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
                System.out.println("Your Task Manager Says \"Bye\"");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Welcome to your task manager\n");

        do{
            displayMenu();
            switchChoice(choice);

        }while(choice != 5);
    }
}