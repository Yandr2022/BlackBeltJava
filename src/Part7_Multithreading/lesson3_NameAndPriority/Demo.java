package Part7_Multithreading.lesson3_NameAndPriority;

public class Demo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Method run. Thread: " + Thread.currentThread());
        });
        Thread thread1 = new Thread(() -> {
            System.out.println("Method run. Thread: " + Thread.currentThread());
        });

        System.out.printf("Default Thread name: %s\nDefault Thread priority: %s\n"
                , thread.getName(), thread.getPriority());
        System.out.printf("Default Thread1 name: %s\nDefault Thread1 priority: %s\n\n"
                , thread1.getName(), thread1.getPriority());

        thread.setName("T1");
        thread1.setName("T2");

        thread.setPriority(2);
        thread1.setPriority(Thread.MAX_PRIORITY);

        System.out.printf("New Thread name: %s\nNew Thread priority: %s\n"
                , thread.getName(), thread.getPriority());
        System.out.printf("New Thread1 name: %s\nNew Thread1 priority: %s\n\n"
                , thread1.getName(), thread1.getPriority());

        thread.start();
        thread1.start();

        thread.run();
        thread1.run();
    }
}

