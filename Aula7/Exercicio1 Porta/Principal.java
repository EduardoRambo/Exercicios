public class Principal {
    public static void main(String args[]) {
        System.out.println("\f");
        
        Porta porta = new Porta(25, 14, 30, "Sim", "Azul"); 
        System.out.println(porta);
        
        Porta porta1 = new Porta(30,40,30, "Não", "Verde");
        System.out.println(porta1);
    }
}