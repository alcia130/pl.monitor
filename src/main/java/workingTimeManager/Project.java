package workingTimeManager;

import java.util.ArrayList;
import java.util.List;

public class Project {
    int id;
    String name;
    List<Task> tasks;

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
        tasks = new ArrayList<>();
    }

    public void AddTask(Task task){
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
