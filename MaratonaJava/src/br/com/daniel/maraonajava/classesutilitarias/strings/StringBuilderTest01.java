package br.com.daniel.maraonajava.classesutilitarias.strings;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Jean Daniel";
        nome.concat(" Engenheiro de Software");
        nome.substring(0,3);
        System.out.println(nome);

        //StrinBuilder tem capacidade padrão de 16 e é imutável, então ele tem mais desempenho que a String normal"
        StringBuilder sb = new StringBuilder("Jean Daniel");
        sb.append(" Engenheiro de Software");
        //substring retorna uma String, por isso não funciona
        sb.substring(0,4);
        //teria que usar assim
        String test = sb.substring(0,4);
        System.out.println(test);
        sb.reverse();
        sb.reverse();
        System.out.println(sb);
    }
}
