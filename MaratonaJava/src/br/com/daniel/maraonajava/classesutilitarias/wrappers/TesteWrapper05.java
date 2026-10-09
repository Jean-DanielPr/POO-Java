package br.com.daniel.maraonajava.classesutilitarias.wrappers;

public class TesteWrapper05 {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        long tamanho = Long.SIZE;

        System.out.println("Int maximo: "+max);
        System.out.println("Int minimo: "+min);
        System.out.println("Double maximo: "+maxDouble);
        System.out.println("Long size: "+tamanho);

        max = Integer.MAX_VALUE + 1;
        System.out.println("Overflow: "+max);
    }
}
