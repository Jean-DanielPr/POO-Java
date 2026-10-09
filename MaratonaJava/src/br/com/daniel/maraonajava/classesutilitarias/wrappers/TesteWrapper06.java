package br.com.daniel.maraonajava.classesutilitarias.wrappers;

public class TesteWrapper06 {
    public static void main(String[] args) {
        String binarioStr = Integer.toBinaryString(255);
        String octalStr = Integer.toOctalString(255);
        String hexadecimalStr = Integer.toHexString(255).toUpperCase();
        System.out.println("255 em");
        System.out.println("Binário: "+binarioStr);
        System.out.println("Octal: "+octalStr);
        System.out.println("Hexadecimal: "+hexadecimalStr);
    }
}
