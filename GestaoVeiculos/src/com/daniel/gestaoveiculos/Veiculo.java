package com.daniel.gestaoveiculos;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private static int cadastrado = 0;

//Método Construtor//
    public Veiculo(String marca, String modelo, int ano, double velocidade){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setVelocidadeAtual(velocidade);
        cadastrado++;
    }

    public void acelerar() {
        acelerar(10);
    }

    public void acelerar(double valor) {
        if(valor >= 0) {
            setVelocidadeAtual(getVelocidadeAtual() + valor);
        } else {
            throw new IllegalArgumentException("Velocidade inválida.");
        }
    }
    public void acelerar(double valor, int repeticoes) {
        if(valor >= 0 & repeticoes >= 0) {
            for (int i = 0; i < repeticoes; i++ ) {
                setVelocidadeAtual(getVelocidadeAtual() + valor);
            }
        } else {
            throw new IllegalArgumentException("Velocidade inválida.");
        }
    }


    public void frear(double valor) {
        if(valor >= 0) {
            setVelocidadeAtual(getVelocidadeAtual() - valor);
        } else {
            throw new IllegalArgumentException("Velocidade inválida.");
        }
    }

    public void exibirStatus() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Velocidade: " + getVelocidadeAtual() + "Km/h");
    }

    public static void carrosCadastrados() {
        System.out.println(getCadastrado() + " carros cadastrados ao total.");
    }

    public abstract void realizarManutencao();
//Métodos especiais//

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("É obrigatório informar a marca do veículo");
        } else {
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("É obrigatório informar o modelo do veículo");
        } else {
            this.modelo = modelo;
        }
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if(ano >= 1886){
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido.");
        }
    }

    private double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    private void setVelocidadeAtual(double velocidadeAtual) {
        if(velocidadeAtual >= 0) {
            this.velocidadeAtual = velocidadeAtual;
        } else {
            throw new IllegalArgumentException("Velocidade inválida");
        }
    }

    public static int getCadastrado() {
        return cadastrado;
    }

    public void setCadastrado(int cadastrado) {
        this.cadastrado = cadastrado;
    }
}
