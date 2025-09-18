package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is a task manager");

        ArrayList<String> Tasks = new ArrayList<String>();

        Tasks.add("Do homework");
        Tasks.add("Clean my room");
        Tasks.add("Cook dinner");

        int i = 0;

        for(String task : Tasks){
            ++i;
            System.out.println("Task number " + i +": " + task);
        }

    }
}