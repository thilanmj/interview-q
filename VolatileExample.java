public class VolatileExample {
    private volatile int count = 0;

    public void increment(){
        count++;
    }

    public void display(){
        System.out.println(" Count" +count);
    }
}
