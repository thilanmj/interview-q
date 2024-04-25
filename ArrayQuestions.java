import java.util.*;
import java.util.stream.IntStream;

public class ArrayQuestions {

    public static void main(String args[]){
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Ranil Disanayaka","Colombo","",87,500000));
        employeeList.add(new Employee("Anura Wikcramasighe","Anuradapura","",57,100000));
        employeeList.add(new Employee("Mahinda Ranawaka","Hambantota","",90,60000000));
        employeeList.add(new Employee("Normal Ranawaka","Hambantota","",39,10000000));
        employeeList.add(new Employee("Kaputu Ranawaka","Hambantota","",66,2000000));
        employeeList.add(new Employee("Rilasiri Jayasekara","Kurunagala","",66,150000));
        employeeList.add(new Employee("Nidikumba De Silva","Boralla","",70,300000));
        employeeList.add(new Employee("Dealdasa Ranawaka","Maharagama","",69,1500000));
        employeeList.add(new Employee("Hitan Appasena","Polonnaruwa","",70,2000000));


        System.out.println(" ARRAY ");
        List<Employee> sortedByNameList = sortByName(employeeList);
        for (Employee employee: sortedByNameList ){
            System.out.println(employee.getName());
        }
        System.out.println(" ========== ");
        List<Employee> sortedByAgeList = sortByAge(employeeList);
        for (Employee employee: sortedByAgeList ){
            System.out.println(employee.getName());
        }
        System.out.println(" ========== ");
        removeEmployeeByName(employeeList,"Ranil Disanayaka");
        for (Employee employee: sortedByAgeList ){
            System.out.println(employee.getName());
        }
        System.out.println(" ========== ");

        int[] numbers = {5, 2, 10, 8, 3, 15, 7};
        System.out.println(secondLargestValue(numbers));

        System.out.println(" ========== ");
        System.out.println(findMaxValue(numbers));

        System.out.println(" ========== ");
        System.out.println(maxSumOfArrayElement(numbers));

        System.out.println(" ========== ");
        System.out.println(updateEmployeeAddress(employeeList,"Hambantota","Colombo"));

        int[] numbersArr = { 5, 2, 8, 2, 5, 10, 8 };
        System.out.println(" ========== ");
        System.out.println(numbersArr.length);
        for (int num: removeDuplicateValues(numbersArr) ){
            System.out.println(num);
        }

        List<Integer> numbersData = new ArrayList<>();
        numbersData.add(5);
        numbersData.add(8);
        numbersData.add(2);
        numbersData.add(5);
        numbersData.add(3);
        numbersData.add(8);
        numbersData.add(5);

        System.out.println("ArrayList: " + numbersData);

        Map<Integer, Integer> oddFrequencyMap = oddNumberFrequency(numbersData);

        System.out.println("Odd numbers and their frequency:");
        for (Map.Entry<Integer, Integer> entry : oddFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time(s)");
        }


    }

    public static List<Employee> sortByName(List<Employee> employeeList){
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return employeeList;
    }

    public static List<Employee> sortByAge(List<Employee> employeeList){
        Collections.sort(employeeList,new AgeCompare());
        return employeeList;
    }

    static class AgeCompare implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            if(o1.getAge() < o2.getAge()){
                return -1;
            }
            if(o1.getAge() > o2.getAge()){
                return 1;
            }
            return 0;
        }
    }

    public static void removeEmployeeByName(List<Employee> employeeList, String name){
        employeeList.removeIf(employee -> employee.getName().equals(name));
    }

    public static int secondLargestValue(int [] intArray){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num: intArray){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static int findMaxValue(int [] numbers){
        if(numbers == null || numbers.length ==0 )
            throw new RuntimeException("Array cannot be empty");

        int max =numbers[0];

        for (int i= 1; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }

    public static int maxSumOfArrayElement(int [] intArray){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num: intArray){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        return largest + secondLargest;
    }

    public static int updateEmployeeAddress(List<Employee> employeeList, String searchValue, String updatedValue){
        int updatedCount =0;
        for (Employee employee: employeeList){
            if(employee.getAddress().equals(searchValue)){
                employee.setAddress(updatedValue);
                updatedCount = updatedCount +1;
            }
        }
        return updatedCount;
    }

    public static int[] removeDuplicateValues(int[] numbers){
        Set<Integer> setValue = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (int num: numbers){
            if (setValue.add(num)){
                result.append(num).append(",");
            }
        }

        String[] uniqueValues = result.toString().split(",");
        int[] uniqueIntArray = new int[uniqueValues.length];

        for (int i = 0; i < uniqueValues.length; i++) {
            uniqueIntArray[i] = Integer.parseInt(uniqueValues[i]);
        }
        return uniqueIntArray;
    }

    public static Map<Integer, Integer>  oddNumberFrequency(List<Integer> arrayList){
        Map<Integer, Integer> oddNumberFrequency = new HashMap<>();
        for (Integer number : arrayList) {
            if (number % 2 != 0) {
                oddNumberFrequency.put(number, oddNumberFrequency.getOrDefault(number, 0) + 1);
            }
        }

        return oddNumberFrequency;
    }

}
