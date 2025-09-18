package task;

public class Task {

    private String description;

    //Entering a new description
    public Task(String taskDescription) {
        this.description = taskDescription;
        System.out.println("Added Task Description: " + taskDescription);
    }

    //Getting the existing tasks
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task: " + description;
    }
}
