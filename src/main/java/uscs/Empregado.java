package uscs;

public class Empregado {
    protected String nome;
    protected String endereco;
    protected double valorHoraTrabalhada;
    protected double horasTrabalhadas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Empregado(String nome, String endereco, double valorHoraTrabalhada, double horasTrabalhadas) {
        this.nome = nome;
        this.endereco = endereco;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Empregado() {
    }
    
    public void ImprimeEmpregado(){
        System.out.println("Dados do empregado");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salario Hora: R$" + valorHoraTrabalhada);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
    }
    
    public double CalculaSalario(){
        return horasTrabalhadas * valorHoraTrabalhada;
    }
    
    public void ImprimeSalario(){
        double salarioFinal = CalculaSalario();
        System.out.println("Nome: " + nome);
        System.out.println("Salario: R$" + salarioFinal);
    }
}
