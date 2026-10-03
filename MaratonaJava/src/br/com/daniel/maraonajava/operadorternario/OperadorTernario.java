package br.com.daniel.maraonajava.operadorternario;

public class OperadorTernario {
    public static void main(String[] args) {
        int idade = 17;

        // (condição) ? se for verdade : se for falsa
        boolean isPodeComprarBebidaAlcoolica = idade >= 18 ? true : false;

        System.out.println(isPodeComprarBebidaAlcoolica);
    }
}
