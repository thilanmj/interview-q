import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayQuestions {

    public static void main(String args[]){
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Ranil Disanayaka","","",87,500000));
        employeeList.add(new Employee("Anura Wikcramasighe","","",57,100000));
        employeeList.add(new Employee("Mahinda Ranawaka","","",90,60000000));
        employeeList.add(new Employee("Normal Ranawaka","","",39,10000000));
        employeeList.add(new Employee("Kaputu Ranawaka","","",66,2000000));
        employeeList.add(new Employee("Rilasiri Jayasekara","","",66,150000));
        employeeList.add(new Employee("Nidikumba De Silva","","",70,300000));
        employeeList.add(new Employee("Dealdasa Ranawaka","","",69,1500000));
        employeeList.add(new Employee("Hitan Appasena","","",70,2000000));


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
}
