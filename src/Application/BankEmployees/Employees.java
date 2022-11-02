package Application.BankEmployees;

import Application.Employers.Employers;

public class Employees extends Employers {

    private String name;
    private int employeeId;
    private int age;
    private String gender;
    private String idnp;

    public Employees(){}

    public Employees(String name,int employeeId,int age,String gender,String idnp){

        this.name = name;
        this.employeeId = employeeId;
        this.age = age;
        this.gender = gender;
        this.idnp = idnp;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public String getIdnp() {
        return this.idnp;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }
}
