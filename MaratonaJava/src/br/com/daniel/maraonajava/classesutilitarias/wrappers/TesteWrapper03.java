package br.com.daniel.maraonajava.classesutilitarias.wrappers;

public class TesteWrapper03 {
    public static void main(String[] args) {
        String strP = "123";

        Integer intW = Integer.parseInt(strP);
        Integer intW2 = Integer.valueOf(strP);
        //parseInt() devolve um int (primitivo)
        //valueOf() devolve um Integer (objeto)

        System.out.println("parseInt: "+intW);
        System.out.println("valueOf: "+intW2);
    }
}
