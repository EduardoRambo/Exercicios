public class Porta {

    //Atributo(s)
    private double largura;
    private double altura;
    private double espessura;
    private String temMacaneta;
    private String cor;
    private String estado;
    
    public Porta(double largura,double altura, double espessura,String temMacaneta,String cor) { 
       setLargura(largura);
       setAltura(altura);
       setEspessura(espessura);
       setTemMacaneta(temMacaneta);
       setCor(cor); 
    }
    
    //Getters
    public double getLargura() {
        return this.largura;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public double getEspessura() {
        return this.espessura;
    }
    
    public String getTemMacaneta() {
        return this.temMacaneta;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    
    //Setters
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void setEspessura(double espessura) {
        this.espessura = espessura;
    }
    
    public void setTemMacaneta(String temMacaneta) {
        this.temMacaneta = temMacaneta;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    //Método
    public String aPortaEstaAberta() {
        if (this.temMacaneta == "Sim") {
        return "Tá aberta";
        }else return "Tá fechada";
    }

    
    //ToString
    @Override
    public String toString() {
        return "Largura: " +this.largura
              +"\nAltura: " +this.altura
              +"\nEspessura: "+this.espessura
              +"\nTem maçaneta? "+this.temMacaneta
              +"\nCor: "+this.cor
              +"\nA porta está aberta? "+this.aPortaEstaAberta()
              +"\n";
    }
}