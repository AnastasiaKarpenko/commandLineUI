
public class Task {

    private String taskName;


    public Task () {
        this.taskName = "";
    }


    public String getTaskName() {
        return this.taskName;
    }

    public void setTask (String task) {
        this.taskName = task;

    }
    
    public String toString () {
        return this.getTaskName();
    }
    
    




}
