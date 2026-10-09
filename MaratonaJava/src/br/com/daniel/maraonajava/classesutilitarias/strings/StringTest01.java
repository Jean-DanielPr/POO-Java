package br.com.daniel.maraonajava.classesutilitarias.strings;

public class StringTest01 {
    public static void main(String[] args) {
        /* As strings nome e nome2 estão apontando para o mesmo objeto na pool de string
        então se eu comparar elas com == vai dar true. Por que o java economiza espaço de
        memoria e deixa o nome "Jean" apenas uma vez na pool de Strings e aponta qualquer
        string com o mesmo nome pra lá */
        String nome = "Jean";
        String nome2 = "Jean";
        System.out.println("Na pool de string usando o ==: "+(nome == nome2));

        /* Abaixo eu instanciei um objeto String que tem o nome Jean. Se eu comparar com
        as strings de cima ele vai dar false porque quando eu instancio um objeto String
        ele não fica alocado no mesmo espaço de memoria (fica fora da pool de String fica no <Heap>)
        preciso usar o equals que compara o conteúdo dentro da memoria
         */
        String nome3 = new String("Jean");
        System.out.println("Objeto String usando o ==: "+(nome == nome3));
        System.out.println("Usando o equals: "+ nome.equals(nome3));
    }

}
