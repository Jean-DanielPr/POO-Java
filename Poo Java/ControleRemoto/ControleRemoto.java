package ControleRemoto;

public class ControleRemoto implements Controlador {
    //Atributos
    boolean ligado;
    boolean tocando;
    int volume;
    int auxMudo;

    //Metodo construtor
    public ControleRemoto() {
        setVolume(100);
        setLigado(false);
        setTocando(false);
    }

    //Metodos especiais
    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //Metodos abstratos
    public void ligar() {
        setLigado(true);
    }

    public void desligar() {
        setLigado(false);
    }

    public void abrirMenu() {
        if(getLigado()) {
            System.out.println("Está ligado: " + getLigado());
            System.out.println("Está tocando: " + getTocando());
            System.out.println("Volume: " + getVolume() + "%.");
            for (int i = 10; i <= getVolume(); i += 10) {
                    System.out.print("*");
            }
        }
    }

    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    public void maisVolume() {
        if (getLigado() && getVolume() < 100) {
            setVolume(getVolume() + 1);
        }
    }

    public void menosVolume() {
        if (getLigado() && getVolume() > 0) {
            setVolume(getVolume() - 1);
        }
    }

    public void ligarMudo() {
        if (getLigado() && getVolume() > 0) {
            auxMudo = getVolume();
            setVolume(0);
        }
    }

    public void desligarMudo() {
        if (getLigado() && getVolume() == 0) {
            setVolume(auxMudo);
        }
    }

    public void play() {
        if (getLigado() && !getTocando()) {
            setTocando(true);
        }
    }

    public void pause() {
        if(getLigado() && getTocando()) {
            setTocando(false);
        }
    }
}
