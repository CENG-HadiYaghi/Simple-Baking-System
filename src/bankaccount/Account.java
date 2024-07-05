
package bankaccount;


public class Account {
    private String Number;
    private double Balance;
    private String name;
    private String Email;
    private String phonenumber;

    public Account(String Number, double Balance, String name, String Email, String phonenumber) {
        this.Number = Number;
        this.Balance = Balance;
        this.name = name;
        this.Email = Email;
        this.phonenumber = phonenumber;
    }
    public void depositmoney(double DepositedMoney){
        this.Balance+=DepositedMoney; //this will add depositedmoney to balance
        System.out.println("Deposit is Successfull , new Balance is :" + this.Balance);
        
    }
    public void withdraw(double withdraw){
        if (withdraw<=this.Balance){
        this.Balance-=withdraw;
        System.out.println("Withdaw successfull , new balance is : "+ this.Balance);
        }else{
            System.out.println("Insuficient Balance " +this.Balance + "is left ");
        }
    }
    
    

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    
   
    
          
}
