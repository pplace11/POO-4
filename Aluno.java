package aula5;

public class Aluno {
    private String Nome;
    private int Idade;
    private int Nota;
    public Aluno(String Nome, int Idade, int Nota){
        this.Nome = Nome;
        this.Idade = Idade;
        this.Nota = Nota;
    }
    public String getNome(){
        return Nome;
    }
    public int getIdade(){
        return Idade;
    }
    public int getNota(){
        return Nota;
    }
    public void decisao(int max){
        if(max>=9.5){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pedro", 22, 0);
        Aluno a2 = new Aluno("Ana", 15, 0);
        a1.decisao(15);
        a2.decisao(9);
    }
}
