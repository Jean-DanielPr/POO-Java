package br.com.daniel.maraonajava.classesutilitarias.wrappers;

public class TesteWrapper07 {
    public static void main(String[] args) {
        try {
            int intP= Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Impossível realizar operação");
            System.out.println("Erro: "+e.getMessage());
        }

    }
}
