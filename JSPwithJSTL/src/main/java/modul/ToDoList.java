package modul;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Den on 16.10.2016.
 */
public class ToDoList {

    private List<Task> taskList = new LinkedList<>();

    private static final ToDoList INSTANCE = new ToDoList();

    private ToDoList(){}

    public static ToDoList getInstance(){
        return INSTANCE;
    }

    public List<Task> getTaskList(){
        return taskList;
    }

    public void addParamToList(Task task){
        taskList.add(task);
    }

    public void removeById(List<Integer> id){
        Iterator<Task> iterator = taskList.iterator();
        while(iterator.hasNext()){
            Task next = iterator.next();
            if(id.contains(next.getId())){
                iterator.remove();
            }
        }
    }

    {
        taskList.add(new Task("task1", "category1"));
        taskList.add(new Task("task2", "category2"));
        taskList.add(new Task("task3", "category3"));

    }
}
