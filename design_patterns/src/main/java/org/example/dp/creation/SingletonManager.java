package org.example.dp.creation;

class TaskManager {

    private volatile static TaskManager obj = null;

    private TaskManager() {
    }

    public static TaskManager getInstance() {
        if (obj == null) {
            synchronized (TaskManager.class) {
                if (obj == null) {
                    obj = new TaskManager();
                }
            }
        }
        return obj;
    }
}
public class SingletonManager {

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            TaskManager obj = TaskManager.getInstance();
            System.out.println(obj);
        });
        Thread t2 = new Thread(() -> {
            TaskManager obj = TaskManager.getInstance();
            System.out.println(obj);
        });
        Thread t3 = new Thread(() -> {
            TaskManager obj = TaskManager.getInstance();
            System.out.println(obj);
        });
        t1.start();
        t2.start();
        t3.start();

    }



}
