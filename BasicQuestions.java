import java.util.Arrays;

public class BasicQuestions {

    public static void main(String[] args) {
        //create array
        int array [] = new int[5];
        //assign value to array
        array[0] = 1;

        //create and assign values
        int array1 [] = new int[]{1,4,3,2,5};
        //int copyArray = arr
        //Array sort
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

    }


}
