package JavaOOP1;

public class Main {
    public static void main(String[] args) {


        Employee[] employeesArr = new Employee[5];

        employeesArr[0] = new Employee("Andriy Nikolayev", "Chef", "andriy@gmail.com", "32914444444", 24,4000);
        employeesArr[1] = new Employee("Bohdan Nikolayev", "Mechanics", "bnikolayev993@gmail.com", "3291846699", 28,3000);
        employeesArr[2] = new Employee("Andriy Yaroshuk", "Operaio", "andriyyaroshuk@gmail.com", "3291846699", 50,3000);
        employeesArr[3] = new Employee("Natalya Nikolayeva", "Chef", "natalya@gmail.com", "3291846699", 51,6000);
        employeesArr[4] = new Employee("Mary Popichuk", "Chef", "mary@gmail.com", "3291845533", 23,5000);

//        ageFilter(20,employeesArr);

//        salaryFilter(4000,6000,employeesArr);
        ageFilter(60,employeesArr);


    }

    public static void ageFilter(int minimalRange, Employee[] employeeArr) {
        for (Employee employee : employeeArr) {
            if (employee.getAge() > minimalRange) {
                employee.employeeInfo();
            }

        }
    }

    public static void salaryFilter(int minSalary, int maxSalary, Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary) {
                employee.employeeInfo();
            }

        }

    }

}


