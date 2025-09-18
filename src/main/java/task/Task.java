package task;

public class Task {

    private String description;

    public Task(String taskDescription) {
        this.description = taskDescription;
        System.out.println("Task Description: " + taskDescription);
    }
}
