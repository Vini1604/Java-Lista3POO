package uscs;

public class Gerente extends Empregado{
    private String secretaria;
    private double bonus;

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Gerente(String nome, String endereco, double valorHoraTrabalhada, double horasTrabalhadas, String secretaria, double bonus){
        super(nome, endereco, valorHoraTrabalhada, horasTrabalhadas);
        this.secretaria = secretaria;
        this.bonus = bonus;
    }
    
    public Gerente(){
        
    }
    
    public void ImprimeGerente(){
        System.out.println("Informações do Gerente");
        System.out.println("Nome do gerente: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salario Hora: R$" + valorHoraTrabalhada);
        System.out.println("Horas Trabalhadas: R$" + horasTrabalhadas);
        System.out.println("Bônus: " + bonus);
        System.out.println("Secretária: " + secretaria);
    }
    

    public double CalculaSalario(){
        return bonus + valorHoraTrabalhada * horasTrabalhadas;
    }
    
}
