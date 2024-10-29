package aula5;

public class Retangulo {
    private double Largura;
    private double Altura;
    public Retangulo(double Largura, double Altura){
        this.Altura = Altura;
        this.Largura = Largura;
    }
    public double cacularArea(){
        return Largura * Altura;
    }
    public double calcularPerimetro(){
        return 2 * (Largura + Altura);
    }
    public double getLargura(){
        return Largura;
    }
    public double getAltura(){
        return Altura;
    }
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(5.5, 3.5);
        double area = r1.cacularArea();
        double perimetro = r1.calcularPerimetro();
        System.out.println("Area do retangulo é " + area);
        System.out.println("Perimetro de um retangulo é " + perimetro);
    }
}
