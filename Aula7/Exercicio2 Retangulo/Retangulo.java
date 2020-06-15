public class Retangulo {
  
    //Atributo(s)
    private double altura;
    private double base;
    
    public Retangulo() {
    
    }
    
    public Retangulo(double altura, double base) {
        setAltura(altura);
        setBase(base);
    }
    
   
    //Getters    
    public double getAltura() {
        return this.altura;    
    }
    
    public double getBase() {
        return this.base;
    }
    
    //Setters
    public void setAltura(double altura) {
        this.altura = altura;    
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    //Métodos
    public double calcularPerimetroDoRetangulo() {
        return  (this.base * 2) + (this.altura *2);
    }
    
    public double calcularAreaDoRetangulo() {
        return this.base * this.altura;
    }
    
    @Override 
    public String toString() {
        return "Base: " +this.base
              +"\nAltura: " +this.altura
              +"\nArea: " +this.calcularAreaDoRetangulo()
              +"\nPerimetro: "+this.calcularPerimetroDoRetangulo();
    }
}