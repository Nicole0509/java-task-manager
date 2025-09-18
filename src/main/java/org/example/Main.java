package org.example;

import task.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is a task manager\n");

        ArrayList<Task> Tasks = new ArrayList<Task>();

        Tasks.add(new Task("Learning java!"));
        Tasks.add(new Task("Learning SSH!"));

    }
}