package nomes;

public class Licenciatura extends Curso implements FormaçãoProfissional {
    
    private float mensalidade;

    @Override
    public void descreverFormacao() {
        System.out.println("Licenciatura: formação voltada principalmente para a docência.");
    }

    public Licenciatura(String n, int c, int d, float mensalidade) {
        super(n, c, d);
        setMensalidade(mensalidade);
    }

    public void calcularMensalidade() {
        getMensalidade();
    }

    public float getMensalidade() {
        return mensalidade;
    }
    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }
    
}