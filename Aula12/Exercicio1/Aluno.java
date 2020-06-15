public class Aluno {
    
    private String nome;
    private double nota1;
    private double nota2;
    private int totalDeAulas;
    private int numeroDePresencas;
    
    public Aluno() {    
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getNota1() {
        return this.nota1;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota2() {
        return this.nota2;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public int getTotalDeAulas() {
        return this.totalDeAulas;
    }
    
    public void setTotalDeAulas(int totalDeAulas) {
        this.totalDeAulas = totalDeAulas;
    }
    
    public int getNumeroDePresencas() {
        return this.numeroDePresencas;
    }
    
    public void setNumeroDePresencas(int numeroDePresencas){
        this.numeroDePresencas = numeroDePresencas;
    }
    
    /**
     * @return retorna a frequencia deste aluno com o numero 
     * de presença * 100 e dividindo pelo total de aulas.
     */
    public double calcularFrequencia() { 
        return (numeroDePresencas * 100) / totalDeAulas;
    }
   
    /**
     * @return retorna a media aritmetica somando nota1 + nota2 e 
     * dividindo pela quantidade de notas(2) / 2 
     */
    public double calcularMediaAritmetica() {
        return (this.nota1 + this.nota2) / 2;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nNota 1: " + this.nota1
             + "\nNota 2: " + this.nota2
             + "\nTotal de Aulas: " + this.totalDeAulas
             + "\nNumero de presenças: " + this.numeroDePresencas
             + "\nNota total: " + this.calcularMediaAritmetica()
             + "\nFrequencia: " + this.calcularFrequencia();
    }
}
