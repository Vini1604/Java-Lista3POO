package uscs;

public class TesteGerente {

    public static void main(String[] args) {
        Empregado e1 = new Empregado("Antonio", "Rua Brasil, 130", 50.00, 230.0);
        Gerente g1 = new Gerente("Carlos", "Rua Silvio Torres, 36", 50.00, 230.0, "Ana", 2000.0);
        
        e1.ImprimeEmpregado();
        e1.ImprimeSalario();
        System.out.println("");
        g1.ImprimeGerente();
        g1.ImprimeSalario();
        
    }
}
