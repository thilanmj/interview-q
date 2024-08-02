public class ArrayQuestion2 {
    public static void main(String args[]){
        int[] numbers = {1,2,3};
        int[] numArray = new int[10];


        int[][] intArray = new int[3][];
        intArray[0] = new int[1];
        intArray[1] = new int[2];
        intArray[2] = new int[3];

        int sum = 0;
        for (int i =0; i<3; ++i){
            for (int j =0; j<i+1; ++j){
                intArray[i][j]=j+1;
            }
        }

        for (int i =0; i<3; ++i){
            for (int j =0; j<i+1; ++j){
                sum += intArray[i][j];
            }
        }
        System.out.println(sum);

        System.out.println(" ======= ");

        int[] arrayVar = new int[10];
        for (int i = 0; i<10; ++i){
            arrayVar[i] = i;
            System.out.print(arrayVar[i]+" ");
            i++;
        }

        System.out.println(" ======= ");

        int[] arrayVar2 = new int[10];
        for (int i = 0; i<10; i++){
            arrayVar2[i] = i    ;
            System.out.print(arrayVar2[i]+" ");
            ++i;
        }
        System.out.println(" ======= ");

       int[] numArray2 = {0,1,2,3,4,5,6,7,8,9};
        int n = 6;
        n = numArray2[numArray2[n]/2];
        System.out.println(" ======= "+n);
        System.out.println(numArray2[n]/2);


        //Object names = new String[3];
        //names[0] = new Integer(0);
        //ARRAY COPY
        int newNumArray[] = new int[numArray2.length];
        System.arraycopy(numArray2,0, newNumArray,0,numArray2.length);



    }
}
