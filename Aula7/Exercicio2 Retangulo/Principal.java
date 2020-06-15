public class Principal {
    public static void main(String args[]) {
        System.out.println("\f");
    
        Retangulo retangulo = new Retangulo();
        retangulo.setBase(4);
        retangulo.setAltura(5);
        
        System.out.println(retangulo);
    
        Retangulo retangulo1 = new Retangulo();
        retangulo1.setBase(4);
        retangulo1.setAltura(2);
        
        System.out.println(retangulo1);
       
        Retangulo retangulo2 = new Retangulo(18,38);
        System.out.println(retangulo2);
        
        
        
    }
}