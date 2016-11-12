import java.util.ArrayList;

public class Worker {

    private String name;
    private String shift;
    private ArrayList<Task> tasks;


    public Worker (String name, String shift ) {
        this.name = name;
        this.shift = shift;
        this.tasks = new ArrayList<Task>();
    }

    public String getName () {
        return this.name;
    }

    public String getShift () {
        return this.shift;
    }

    public void assignTask(Task task) {
        this.tasks.add(task);
    }

    public String printArrayList(ArrayList<Task> tasks) {
        String result = " ";
        if (tasks.isEmpty()) {
            result = " N/A ";
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                if (i == tasks.size() - 1) {
                    result += tasks.get(i);
                } else if (tasks.size() == 1)  {
                    result += tasks.get(i);

                } else {
                    result += tasks.get(i) + ", ";
                }
            }
        }


        return result;
    }

    public String toString() {
        return this.getName() + " " + this.getShift() + " " + this.printArrayList(tasks);
    }
}
