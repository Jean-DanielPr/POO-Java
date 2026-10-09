package br.com.daniel.maraonajava.classesutilitarias.wrappers;

public class TesteWrapper04 {
    public static void main(String[] args) {
        Integer numero = 50; //boxing
        int numeroP = numero; //unboxing
        int numeroP2 = numero.intValue();
        double doubleP = numero.doubleValue();

        System.out.println("unboxing: "+numeroP+"\nintValue: "+numeroP2+"\ndoubleValue: "+doubleP);
    }
}
