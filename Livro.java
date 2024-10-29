package aula5;

public class Livro {
    private String Titulo;
    private String Autor;
    private int AnoPublicacao;
    private double Preco;
    public Livro (String Titulo, String Autor, int AnoPublicacao, double Preco){
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.AnoPublicacao = AnoPublicacao;
        this.Preco = Preco;
    }
    public String getTitulo(){
        return Titulo;
    }
    public String getAutor(){
        return Autor;
    }
    public int getAnoPublicacao(){
        return AnoPublicacao;
    }
    public double getPreco(){
        return Preco;
    }
    public void Desconto(double percentagemDesconto){
        double soma = Preco - (percentagemDesconto/100 * Preco);
        System.out.println("O valor do livro com desconto é " + soma);
    }
    public static void main(String[] args) {
        Livro v1 = new Livro("Harry Potter e a Pedra Filosofal", "J.K.Rowing", 1997, 20 );
        v1.Desconto(20);
    }
}
