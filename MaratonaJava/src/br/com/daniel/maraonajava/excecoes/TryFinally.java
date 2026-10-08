package br.com.daniel.maraonajava.excecoes;

// O bloco finally é executado toda vez que eu tenho um catch, independente se ele capturou uma exceção ou não

public class TryFinally {
    public static void main(String[] args) {
        try {
            processarPagamento(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Falha na operação.\nErro detectado: "+e.getMessage());
        } finally {
            System.out.println("Processamento encerrado.");
        }
    }

    public static void processarPagamento(double valor) {
        if (valor <= 0){
            throw new IllegalArgumentException("O valor deve ser maior do que 0");
        } else {
            System.out.println("Pagamento de R$"+valor+" processado.");
        }
    }
}
