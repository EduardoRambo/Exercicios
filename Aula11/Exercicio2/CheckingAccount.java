public class CheckingAccount extends Account {

    private double tax;
    
    @Override
    public double withdraw() {
        return this.balance * tax;
    }
    
    @Override
    public double deposit() {
        return this.balance * tax;
    }
    
}