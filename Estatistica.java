package aula5;

import java.util.Arrays;

public class Estatistica {
    private int[] Numero;
    public Estatistica(int tamanho){
        Numero = new int [tamanho];
    }
    public int[] definirValores(int[] valores){
        int soma = 0;
        int media = 0;
        for(int i=0; i<valores.length; i++){
            soma  = soma + valores[i];
        }
        media = soma/valores.length;
        return valores;
    }
    public void info(int definirValores){
        int [] 
        System.out.println(Arrays.toString(Numero));
    }
    public static void main(String[] args) {
        Estatistica e1 = new Estatistica(0)
    }
}
