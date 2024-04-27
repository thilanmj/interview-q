import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayQuestions {

    public static void main(String args[]) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Ranil Disanayaka", "Colombo", "", 87, 500000));
        employeeList.add(new Employee("Anura Wikcramasighe", "Anuradapura", "", 57, 100000));
        employeeList.add(new Employee("Mahinda Ranawaka", "Hambantota", "", 90, 60000000));
        employeeList.add(new Employee("Normal Ranawaka", "Hambantota", "", 39, 10000000));
        employeeList.add(new Employee("Kaputu Ranawaka", "Hambantota", "", 66, 2000000));
        employeeList.add(new Employee("Rilasiri Jayasekara", "Kurunagala", "", 66, 150000));
        employeeList.add(new Employee("Nidikumba De Silva", "Boralla", "", 70, 300000));
        employeeList.add(new Employee("Dealdasa Ranawaka", "Maharagama", "", 69, 1500000));
        employeeList.add(new Employee("Hitan Appasena", "Polonnaruwa", "", 70, 2000000));


        System.out.println(" ARRAY ");
        List<Employee> sortedByNameList = sortByName(employeeList);
        for (Employee employee : sortedByNameList) {
            System.out.println(employee.getName());
        }
        System.out.println(" ========== ");
        List<Employee> sortedByAgeList = sortByAge(employeeList);
        for (Employee employee : sortedByAgeList) {
            System.out.println(employee.getName());
        }
        System.out.println(" ========== ");
        removeEmployeeByName(employeeList, "Ranil Disanayaka");
        for (Employee employee : sortedByAgeList) {
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
        System.out.println(updateEmployeeAddress(employeeList, "Hambantota", "Colombo"));


    }

    public static List<Employee> sortByName(List<Employee> employeeList) {
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return employeeList;
    }

    public static List<Employee> sortByAge(List<Employee> employeeList) {
        Collections.sort(employeeList, new AgeCompare());
        return employeeList;
    }

    public static void removeEmployeeByName(List<Employee> employeeList, String name) {
        employeeList.removeIf(employee -> employee.getName().equals(name));
    }

    public static int secondLargestValue(int[] intArray) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : intArray) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static int findMaxValue(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            throw new RuntimeException("Array cannot be empty");

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int maxSumOfArrayElement(int[] intArray) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : intArray) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return largest + secondLargest;
    }

    public static int updateEmployeeAddress(List<Employee> employeeList, String searchValue, String updatedValue) {
        int updatedCount = 0;
        for (Employee employee : employeeList) {
            if (employee.getAddress().equals(searchValue)) {
                employee.setAddress(updatedValue);
                updatedCount = updatedCount + 1;
            }
        }
        return updatedCount;
    }

    public static void removeDuplicateValues(int[] numbers) {

    }

    static class AgeCompare implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getAge() < o2.getAge()) {
                return -1;
            }
            if (o1.getAge() > o2.getAge()) {
                return 1;
            }
            return 0;
        }
    }

}
