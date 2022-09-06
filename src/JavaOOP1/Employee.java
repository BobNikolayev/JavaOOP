package JavaOOP1;

public class Employee {

    private  String name;
    private String jobTitle;
    private String eMail;
    private String phoneNumber;
    private int Age;
    private int salary;

    public Employee(String name, String jobTitle, String eMail, String phoneNumber, int age, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.Age = age;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return Age;
    }

    public void employeeInfo(){
        System.out.println(getName() + "\n" +geteMail() + "\n" + getJobTitle() + "\n" + getPhoneNumber() + "\n" + getAge() + "\n" + getSalary());

    }



    }


