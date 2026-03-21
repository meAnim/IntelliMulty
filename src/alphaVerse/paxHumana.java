package alphaVerse;

public class paxHumana {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        System.out.println("we are in the " + Thread.currentThread().getName());
        thread.start();
        System.out.println("The thread has started");

        System.out.println("we are in thread" + Thread.currentThread().getName());

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }


    }
}
