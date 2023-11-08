public class BankAccount {
    private String id;
    private String name;
    private double balance;

    public BankAccount(){
        this.id ="0553603668";
        this.name="Surachart";
        this.balance = 1000;
    }

    public BankAccount(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void deposit(double amount){
        this.balance = this.balance+amount;
    }

    public void withdraw(double amount){
        if(this.balance>=amount){
            this.balance = this.balance-amount;
        }else{
            System.out.println("ยอดเงินของคุณไม่เพียงพอ");
        }
        
    }

    public double checkBalance(){
        return this.balance;
    }
}
