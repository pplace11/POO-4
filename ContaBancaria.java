package aula5;

public class ContaBancaria {
    private String Titular;
    private int NumeroConta;
    private double  Saldo;
    public ContaBancaria(String Titular, int NumeroConta, double Saldo){
        this.Titular = Titular;
        this.NumeroConta = NumeroConta;
        this.Saldo = Saldo;
    }
    public String getTitular(){
        return Titular;
    }
    public int getNumeroConta(){
        return NumeroConta;
    }
    public double getSaldo(){
        return Saldo;
    }
    public void aumentardinheiro(double valor){
        double soma = Saldo + valor;
        System.out.println("Valor de deposico mais o saldo é " + soma);
    }
    public void diminuirdinheiro(double valor){
        double sub = Saldo - valor;
        System.out.println("Valor da conta sem o levantamento é " + sub);
    }
    public void info(){
        System.out.println("O numuro da sua conta é " + NumeroConta + " ,o nome da conta esta em " + Titular + " e o seu saldo disponivel atual é " + Saldo);
    }
    public static void main(String[] args) {
        ContaBancaria n1 = new ContaBancaria("Tiago", 242566, 0);
        ContaBancaria n2 = new ContaBancaria("Pedro", 110669, 1000000);
        ContaBancaria n3 = new ContaBancaria("Bruna",98796, 200000);
        n2.aumentardinheiro(0);
        n2.diminuirdinheiro(10000000);
        n2.info();
    }
}
