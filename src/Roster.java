import java.util.HashMap;


public class Roster {

    private HashMap<Worker, Task> roster;

    public Roster() {
        this.roster = new HashMap<Worker, Task>();
    }

    public void addWorker(Worker worker, Task task) {
        roster.put(worker, task);
    }


}
