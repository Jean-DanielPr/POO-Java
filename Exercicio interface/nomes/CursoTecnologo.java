package nomes;

public class CursoTecnologo extends Curso implements FormaçãoProfissional {
    
    private float mensalidade;

    @Override
    public void descreverFormacao() {
        System.out.println("Tecnólogo: formação mais curta e voltada ao mercado de trabalho.");
    }

    public CursoTecnologo(String n, int c, int d, float mensalidade) {
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