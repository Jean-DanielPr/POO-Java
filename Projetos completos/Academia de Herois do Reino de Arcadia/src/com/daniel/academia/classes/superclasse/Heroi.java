package com.daniel.academia.classes.superclasse;
import com.daniel.academia.interfaces.OperacoesHerois;


/* Super classe Heroi. É daqui de onde as classes filhas vao herdar os atributos e métodos. Essa classe implementa
a interface OperacoesHerois com apenas 1 metodo */
public abstract class Heroi implements OperacoesHerois {
    private String nome;
    private int nivel;
    private int vida;
    private int mana;
    private static int qtdHerois = 0;
    private static final int limiteHerois = 20;

    // Metodo construtor
    /*O metodo construtor instancia os atributos comuns dos herois e ele é sobrescrito em cada classe filha
    * utilizando a palavra super e adicionando os atributos partculares de cada filha
    * Ele também conta o total de herois cadastrados atravez do atributo qtdHerois que é estático, também
    * fiz uma verificação dentro do metodo construtor lançando um IllegalStateException que indica que o limite foi atingido.
    * NÃO FIZ O TRY CATCH DESSA EXEÇÃO ENTÃO O PROGRAMA SÓ VAI TERMINAR CASO O LIMITE SEJA EXCEDIDO.
    * Eu coloque os os setters dentro do metodo construtor para ele validar a regra que coloquei de não aceitar valores
    * maiores do que 100 */
    public Heroi(String nome, int nivel, int vida, int mana) {
        this.nome = nome;
        setNivel(nivel);
        setVida(vida);
        setMana(mana);
        qtdHerois++;
        if (qtdHerois > limiteHerois){
            throw new IllegalStateException("Apenas 20 herois podem ser cadastrados.");
        }
    }

    // Métodos específicos
    /* Metodo estático exibirNumHerois me possibilita ver o número de herois cadastrados de qualquer lugar
    sem presicar instanciar um objeto, até porque a classe é abstrata */
    public static void exibirNumHerois() {
        System.out.println(qtdHerois + " Herois cadastrados.");
    }


    //Esse metodo lista dos os herois e faz uma verificação para saber se tem algum heroi cadastrado
    @Override
    public void listarHerois() {
        if (qtdHerois == 0) {
            System.out.println("Não existe nenhum heroi cadastrado.");
        } else {
            System.out.println("Nome: " + this.nome);
            System.out.println("Nivel: " + this.nivel);
            System.out.println("Vda: " + this.vida);
            System.out.println("Mana: " + this.mana);
        }
    }

    // Métodos especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        if (nivel > 100) {
            throw new IllegalArgumentException("O limite máximo de nível é 100.");
        } else {
            this.nivel = nivel;
        }

    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        if (vida > 100) {
            throw new IllegalArgumentException("O limite máximo de vida é 100.");
        } else {
            this.vida = vida;
        }
    }

    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        if (mana > 100) {
            throw new IllegalArgumentException("O limite máximo de mana é 100.");
        } else {
            this.mana = mana;
        }
    }
}
