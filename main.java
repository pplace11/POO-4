package aula5;

public class main {
    public static void main(String[] args) {
        ContaBancaria n1 = new ContaBancaria("Tiago", 242566, 0);
        ContaBancaria n2 = new ContaBancaria("Pedro", 110669, 1000000);
        ContaBancaria n3 = new ContaBancaria("Bruna",98796, 200000);
        n2.aumentardinheiro(20);
        n2.diminuirdinheiro(100000);
        n2.info();
    }
}
