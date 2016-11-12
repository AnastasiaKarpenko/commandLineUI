public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker ("Andie ", "8:00 - 12:00");
        Worker worker2 = new Worker ("Cindy ", "8:00 - 12:00");
        Worker worker3 = new Worker ("Minja ", "12:00 - 4:00");
        Worker worker4 = new Worker ("Miika ", "12:00 - 4:00");
        Worker worker5 = new Worker ("Marco ", "4:00 - 8:00");
        Worker worker6 = new Worker ("Tiimo ", "4:00 - 8:00");
        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = new Task();
        Task task4 = new Task();
        task1.setTask("Cement Transport");
        task2.setTask("On-site construction");
        task3.setTask("Transfer of blocks");
        task4.setTask("Start machinery");
        worker1.assignTask(task1);
        worker1.assignTask(task4);
        worker2.assignTask(task1);
        worker3.assignTask(task2);
        worker4.assignTask(task2);
        worker5.assignTask(task3);
        worker6.assignTask(task4);

        System.out.println(worker1.toString());
        System.out.println(worker2.toString());
        System.out.println(worker3.toString());
        System.out.println(worker4.toString());
        System.out.println(worker5.toString());
        System.out.println(worker6.toString());

    }


}
