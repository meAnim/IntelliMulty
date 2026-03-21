package alphaVerse;

public class PaxHumana extends Thread{
    @Override
    public void run() {
        this.setName("Human Rule");
        System.out.println("we are in the new thread " + this.getName());
    }
}
