package br.com.daniel.maraonajava.classesutilitarias.wrappers;

public class TesteWrapper02 {
    public static void main(String[] args) {
        int intP = 2;
        double doubleP = 3.0;
        boolean booleanP = true;
        char charP = 'D';

        //boxing or autoboxing
        Integer intW = intP;
        Double doubleW = doubleP;
        Boolean booleanW = booleanP;
        Character charW = charP;
        // também poderia fazer o autoboxing assim > Integer intW = 2;

        //unboxing
        int i = intW;

        System.out.println("Integer: "+intW);
        System.out.println("Double: "+doubleW);
        System.out.println("Boolean: "+booleanW);
        System.out.println("Character: "+charW);

        //boxing manual com valueOf()
        Integer intW2 = Integer.valueOf(intP);
        Double doubleW2 = Double.valueOf(doubleP);
        Boolean booleanW2 = Boolean.valueOf(booleanP);
        Character charW2 = Character.valueOf(charP);

        System.out.println("Integer (valueOf): "+intW2);
        System.out.println("Double (valueOf): "+doubleW2);
        System.out.println("Boolean (valueOf): "+booleanW2);
        System.out.println("Character (valueOf): "+charW2);

    }
}
