package lesson5;

public class SequencePrint {
    //有三个线程，每个线程只能打印一个A或B或C
    //同时执行三个线程，按CBA方式打印

    public static void main(String[] args) {
        Thread c=new Thread(new Task("C",null));
        Thread b=new Thread(new Task("B",c));
        Thread a=new Thread(new Task("A",b));
        a.start();
        b.start();
        c.start();
    }
    private static class Task implements Runnable{
        private String print;
        private Thread task;

        public Task(String print, Thread task) {
            this.print = print;
            this.task = task;
        }

        @Override
        public void run() {
            try {
                if(task != null)
                task.join();
                System.out.println(print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
