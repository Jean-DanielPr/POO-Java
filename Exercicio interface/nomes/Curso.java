package nomes;
public abstract class Curso {
    
    private String nome;
    private int codigo, duracaoSemestres;

    public Curso(String n, int c, int d) {
        setNome(n);
        setCodigo(c);
        setDuracaoSemestres(d);
    }

    public void exibirInformacoes() {
        System.out.println("Nome curso: \nCodigoCurso: \n Duração do curso: " + getNome() + getCodigo() + getDuracaoSemestres());
    }

    public abstract void calcularMensalidade();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDuracaoSemestres() {
        return duracaoSemestres;
    }

    public void setDuracaoSemestres(int duracaoSemestres) {
        this.duracaoSemestres = duracaoSemestres;
    }

}