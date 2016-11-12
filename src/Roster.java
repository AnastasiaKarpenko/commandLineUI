import java.util.ArrayList;


public class Roster {

    private ArrayList<Worker> roster;

    public Roster () {
        this.roster = new ArrayList<Worker>();
    }

    public void addWorker(Worker worker) {
        roster.add(worker);
    }

    public void print () {
        for (Worker worker : roster) {
            System.out.println(worker.toString());
        }
    }




}
