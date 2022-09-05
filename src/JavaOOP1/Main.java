package JavaOOP1;

public class Main {
    public static void main(String[] args) {


        Employee[] employeesArr = new Employee[5];

        employeesArr[0] = new Employee("Andriy Nikolayev", "Chef", "andriy@gmail.com", "32914444444", 24);
        employeesArr[1] = new Employee("Bohdan Nikolayev", "Mechanics", "bnikolayev993@gmail.com", "3291846699", 28);
        employeesArr[2] = new Employee("Andriy Yaroshuk", "Operaio", "andriyyaroshuk@gmail.com", "3291846699", 50);
        employeesArr[3] = new Employee("Natalya Nikolayeva", "Chef", "natalya@gmail.com", "3291846699", 51);
        employeesArr[4] = new Employee("Mary Popichuk", "Chef", "mary@gmail.com", "3291845533", 23);

        ageFilter(20,employeesArr);


    }

    public static void ageFilter(int minimalRange, Employee employeeArr[]) {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getAge() > minimalRange) {
                employeeArr[i].employeeInfo();
            }

        }
    }
}


