package org.example;

import task.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Task> tasks = new ArrayList<Task>();

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
        scanner.nextLine();
    }

    public static void switchChoice(int choice) {
        switch (choice) {
            case 1:
                if(tasks.isEmpty()) {
                    System.out.println("\nNo Tasks Found");
                } else{
                    System.out.println("\nView All Tasks");

                    for (Task task : tasks) {
                        System.out.println(task);
                    }
                }
                break;
            case 2:
                System.out.println("\nAdd Task");
                tasks.add(new Task("Coding in Java!"));
                tasks.add(new Task("Learning How to be consistent with my plans!"));
                tasks.add(new Task("Become a better ME!"));
                System.out.print("\nEnter a Task Description: ");
                tasks.add(new Task(scanner.nextLine()));
                break;
            case 3:
                System.out.println("\nUpdate Task");
                break;
            case 4:
                System.out.println("\nDelete Task");
                break;
            case 5:
                System.out.println("\nExit");
                System.out.println("Your Task Manager Says \"Bye\"");
                break;
            default:
                System.out.println("\nInvalid choice");
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