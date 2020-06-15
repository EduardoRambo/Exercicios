public class Main {

    public static void main(String args[]) {
     
        System.out.println("\f");
    
        PhysicalPerson physicalPerson = new PhysicalPerson("0334","Maria","Teacher","Married","0403021038" ,"19/03/1960"   );
        System.out.println(physicalPerson);
        
        JuridicalPerson juridicalPerson = new JuridicalPerson("0253","Julia","Carpenter","Generic enterprise name blablabla","231231234123","Registered blablabla", 10344.00);
        System.out.println(juridicalPerson);
        
    }
}