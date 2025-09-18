package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is a task manager\n");

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> Tasks = new ArrayList<String>();

        Tasks.add("Do homework");
        Tasks.add("Clean my room");
        Tasks.add("Cook dinner");

        int i = 0;

        System.out.println("Your current tasks:");

        for(String task : Tasks){
            ++i;
            System.out.println("Task number " + i +": " + task);
        }

        System.out.println();

        System.out.println("Please enter the number of items you want to add: ");
        String newTask = scanner.nextLine();
        System.out.println(newTask);

        Tasks.add(newTask);

        for(String task : Tasks){
            ++i;
            System.out.println("Task number " + i +": " + task);
        }
    }
}