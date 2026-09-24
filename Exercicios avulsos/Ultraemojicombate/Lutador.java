
public class Lutador {
    private String nome;
    private String nacionalidade;    
    private int idade;
    private float altura, peso;
    private String categoria;
    private int vitorias, derrotas, empates;

//Método construtor

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

//Métodos específicos

    public void apresentar() {
        System.out.println("Apresentamos o LUTADOR!!!");
        System.out.println(getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + "anos.");
        System.out.println(getAltura() + "m de altura.");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }

    public void status() {
        System.out.println(getNome() + " É um peso: " + getCategoria());
        System.out.println("Ganhou "  + getVitorias() + " vezes.");
        System.out.println("Perdeu "  + getDerrotas() + " vezes.");
        System.out.println("Empatou "  + getEmpates() + " vezes.");
        System.out.println("======================================");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
   
//Métodos especiais

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(peso < 52.2) {
            categoria = "Inválido";
        } else if(peso <= 70.3) {
            categoria = "Leve";
        } else if(peso <= 83.9) {
            categoria = "Médio";
        } else if(peso <= 120.2) {
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }

    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }


}