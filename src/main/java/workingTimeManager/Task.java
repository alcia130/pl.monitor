package workingTimeManager;

public class Task {
    private int id;
    private String name;
    private Project project;
    public Task(int id, String name, Project project) {
        this.id = id;
        this.name = name;
        this.project = project;
    }
}
