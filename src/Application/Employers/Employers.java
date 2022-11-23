package Application.Employers;

import Application.HeadOffice.HeadOffice;
import java.util.ArrayList;

public class Employers extends HeadOffice{

    private int employerId;
    private String name;
    private int age;

    public Employers(){}

    public Employers(int employerId,String name,int age){
        this.employerId = employerId;
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    public int getEmployerId() {
        return this.employerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
