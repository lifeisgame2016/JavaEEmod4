package modul;

/**
 * Created by Den on 16.10.2016.
 */
public class Task {

    private static int counter;
    private int id = ++counter;

    private String task;
    private String category;

    public Task(String task, String category) {
        this.task = task;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
