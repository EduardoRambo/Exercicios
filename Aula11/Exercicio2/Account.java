public abstract class Account {

    protected String holder;
    protected int agencyNumber;
    protected double balance;
    
    public Account() {
    }
    
   
    public String getHolder() {
        return this.holder;
    }
    
    public void setHolder(String holder) {
        this.holder = holder;
    }
    
    public int getAgencyNumber() {
        return this.agencyNumber;
    }
    
    public void setAgencyNumber(int agencyNumber) {
        this.agencyNumber = agencyNumber;
    }
      
    public double getBalance() {
        return this.balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    } 

    public abstract double withdraw();
    public abstract double deposit();

}