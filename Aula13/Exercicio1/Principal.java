import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        System.out.println("Digite seu nome: ");
        aluno.setNome(scanner.next());
        System.out.println("Digite a nota 1: ");
        aluno.setNota1(scanner.nextDouble());
        System.out.println("Digite a nota 2: ");
        aluno.setNota2(scanner.nextDouble());
        System.out.println("Digite número de presenças: ");
        aluno.setNumeroDePresencas(scanner.nextInt());
        System.out.println("Digite número de total de aulas: ");
        aluno.setTotalDeAulas(scanner.nextInt());
        System.out.println(aluno);
        
    }
}