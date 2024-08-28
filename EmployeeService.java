public interface EmployeeService {
    default String getName(){
        return "default";
    }

    default int getAge(){
        return 32;
    }

    static void doAgeCalculation(){

    }

    static void doSalaryCalculation(){

    }
}
