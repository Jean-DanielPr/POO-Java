package Banco;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

public void estadoConta() {
    System.out.println("---------------------------");
    System.out.println("Num conta: " + getNumConta());
    System.out.println("Tipo conta: " + getTipo());
    System.out.println("Titular: " + getDono());
    System.out.println("Saldo: R$" + getSaldo());
    System.out.println("Conta em funcionamento?: " + getStatus());
}

//Metodo Construtor 

    public Conta() {
        setSaldo (0f);
        setStatus (false);
    }

// Metodos especificos    
    
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t.equals("CC")) {
            setSaldo(50f);
        } else if (t.equals("CP")) {
            setSaldo(150f);
        } 
    }

    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("A conta contem saldo.");          
        } else if (saldo < 0) {
            System.out.println("A conta contem debito.");
        } else {
            setStatus(false);
        }
    }

    public void depositar(float v) {
        if (getStatus()) {
            setSaldo(getSaldo() + v);    
        } else {
            System.out.println("Esta conta esta encerrada.");
        }
    }

    public void sacar(float v) {
        if (getStatus()) {
           if (getSaldo() < v) {
                System.out.println("Saldo insuficiente.");
           } else {
                setSaldo(getSaldo() - v);
           }
        } else {
            System.out.println("Impossivel sacar. \nConta Fechada.");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if (getTipo() == "CC") {
            v = 12f;
        } else if (getTipo() == "CP") {
            v = 20f;
        } 
        if (getStatus()) {
            if (getSaldo() > v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }                             
        } else {
            System.out.println("Impossivel pagar mensalidade. \nConta fechada.");
        }
    }

// Metodos especiais

    public void setNumConta(int n) {
        numConta = n;
    }
    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String t) {
        tipo = t;
    }
    public String getTipo() {
        return tipo;
    }

    public void setDono(String d) {
        dono = d;
    }
    public String getDono() {
        return dono;
    }

    public void setSaldo(float s) {
        saldo = s;
    }
    public float getSaldo() {
        return saldo;
    }

    public void setStatus(boolean s) {
        status = s;
    }
    public boolean getStatus() {
        return status;
    }

}
