package aula5;

public class Carro {
    private String Modelo;
    private String Marca;
    private int Ano;
    private double Quilometragem;
    public Carro (String Modelo, String Marca, int Ano, double Quilometragem){
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Ano = Ano;
        this.Quilometragem = Quilometragem;
    }
    public void aumentarkm(double km){
        double soma = km + Quilometragem;
        System.out.println("A quilometragem do veiculo é " + soma);
    }
    public String getsModelo(){
        return Modelo;
    }
    public String getMarca(){
        return Marca;
    }
    public int getAno(){
        return Ano;
    }
    public double getQuilometragem(){
        return Quilometragem;
    }
    public static void main(String[] args) {
        Carro b1 = new Carro("X", "Tesla", 2024, 1000);
        b1.aumentarkm(1000);
    }
}
