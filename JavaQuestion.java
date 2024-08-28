public class JavaQuestion {
    public static void main(String args[]){
        char a = 'A';
        a++;
        System.out.println((int)a);

        System.out.println(" ===== ");

        boolean var1= true;
        boolean var2= false;

        if(var1){
            System.out.println(var1);
        }else {
            System.out.println(var2);
        }

        VolatileExample volatileExample = new VolatileExample();

        volatileExample.increment();
        volatileExample.display();

    }
}
