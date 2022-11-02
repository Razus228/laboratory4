package Application;

import Application.Atm.Atm;
import Application.BankClient.Client;
import Application.BankEmployees.Employees;
import Application.Cards.Card;
import Application.Deposit.Deposit;
import Application.Employers.Employers;
import Application.Exchange.Exchange;
import Application.HeadOffice.HeadOffice;
import Application.Loan.Loan;
import Application.Transaction.Transaction;


public class Main {
    public static void main(String[] args) {

        HeadOffice office = new HeadOffice();
        office.setAdress("Stefan cel Mare 1");
        office.setBankName("MAIB");
        System.out.println("Bank adress: "+office.getAdress());
        System.out.println("Bank adress: "+office.getBankName());
        office.WalkinBank();

        System.out.println("\n");

        Employers employer = new Employers();
        employer.setEmployerId(1);
        employer.setAge(39);
        employer.setName("Igor");
        System.out.println("Employer Id: "+employer.getEmployerId());
        System.out.println("Employer Name: "+employer.getName());
        System.out.println("Employer Age: "+employer.getAge());
        employer.WalkinBank();

        System.out.println("\n");

        Employees employee = new Employees();
        employee.setEmployeeId(1);
        employee.setName("Vasea");
        employee.setIdnp("0123451");
        employee.setGender("Feminin");
        employee.setAge(45);
        System.out.println("Employee Id: "+employee.getEmployeeId());
        System.out.println("Employee Name: "+employee.getName());
        System.out.println("Employee Idnp: "+employee.getIdnp());
        System.out.println("Employee Gen: "+employee.getGender());
        System.out.println("Employee Age: "+employee.getAge());
        employee.WalkinBank();

        System.out.println("\n");

        Client client  = new Client();
        client.setName("Vasea Pupkin");
        client.setIdnp("213234552");
        client.setAge(7);
        client.setAdress("Uzinelor 18");
        client.setGender("Undefined");
        System.out.println("Client Idnp: "+client.getIdnp());
        System.out.println("Employee Name: "+client.getName());
        System.out.println("Employee Age: "+client.getAge());
        System.out.println("Employee Adress: "+client.getAdress());
        System.out.println("Employee Gender: "+client.getGender());
        client.WalkinBank();
        client.Actions();

        System.out.println("\n");

        Card card = new Card();
        card.setCardId(228);
        card.setPinCode(1111);
        card.setAmount(451);
        System.out.println("Card Id: "+card.getCardId());
        System.out.println("Card Pin: "+card.getPinCode());
        System.out.println("Card Amount: "+card.getAmount());
        card.Actions();

        System.out.println("\n");

        Exchange exchange = new Exchange();
        exchange.setExchangeRateDollar(22);
        exchange.setExchangeRateEuro(18);
        System.out.println("Euro: "+exchange.getExchangeRateEuro());
        System.out.println("Dollar: "+exchange.getExchangeRateDollar());
        exchange.Change();

        System.out.println("\n");

        Deposit deposit = new Deposit();
        deposit.setDepositId(4);
        deposit.setDepositAmount(1234651);
        System.out.println("Deposit Id: "+deposit.getDepositId());
        System.out.println("Deposit Amount: "+deposit.getDepositAmount());
        deposit.Actions();

        System.out.println("\n");

        Loan loan = new Loan();
        loan.setLoanId(7);
        loan.setLoanAmount(600);
        loan.setRate(12);
        System.out.println("Loan Id: "+ loan.getLoanId());
        System.out.println("Loan Amount: "+ loan.getLoanAmount());
        System.out.println("Loan Rate: "+ loan.getRate());
        loan.Actions();

        System.out.println("\n");

        Atm atm = new Atm();
        atm.setCardId(12451113);
        atm.setAtmAdress("Stefan cel Mare 32");
        atm.setAmount(578);
        System.out.println("Atm CardId: "+atm.getCardId());
        System.out.println("Atm Amount: "+atm.getAmount());
        System.out.println("Atm Adress: "+atm.getAtmAdress());
        atm.Actions();

        System.out.println("\n");

        Transaction transaction = new Transaction();
        transaction.setTransactionId(56);
        transaction.setAmount(21000);
        System.out.println("Transaction Id: "+ transaction.getTransactionId());
        System.out.println("Transaction Amount: "+ transaction.getAmount());
        transaction.Actions();

    }
}