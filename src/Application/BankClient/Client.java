package Application.BankClient;

import Application.BankEmployees.Employees;

public class Client extends Employees {
    public void Actions() {

        System.out.println("Take money, Use money, Check money");
    }
    public void Change(){

        System.out.println("Exchange rate, exchange money");
    }
    public static int clientCount = 0;
    private String name;
    private String idnp;
    private int age;
    private String adress;
    private String gender;

    public Client(){}

    public Client(String name,String idnp,int age,String adress,String gender){
        this.name = name;
        this.idnp = idnp;
        this.age = age;
        this.adress = adress;
        this.gender = gender;
        clientCount++;

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setIdnp(String idnp){
        this.idnp = idnp;
    }
    public String getIdnp(){
        return this.idnp;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    public String getAdress(){
        return this.adress;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return this.gender;
    }

}
