package br.com.daniel.maraonajava.classesutilitarias.wrappers;

public class TesteWrapper {
    public static void main(String[] args) {
        System.out.println("Teste válido");
        calcularTotal("100", "3");
        System.out.println("Teste inválido");
        calcularTotal("100", "tres");
    }

    private static void calcularTotal(String precoStr, String quantidadeStr) {

        try {
            double preco = Double.parseDouble(precoStr);
            int qtd = Integer.parseInt(quantidadeStr);
            double total = qtd * preco;
            System.out.println("O valor total foi de R$"+total);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}
