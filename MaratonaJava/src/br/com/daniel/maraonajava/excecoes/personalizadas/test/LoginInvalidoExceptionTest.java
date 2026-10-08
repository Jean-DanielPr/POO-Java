package br.com.daniel.maraonajava.excecoes.personalizadas.test;

import br.com.daniel.maraonajava.excecoes.personalizadas.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

// Aqui eu simulo a conexao com um banco de dados para testar a excessao personalizada

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "jean";
        String senhaDB = "naej";
        System.out.println("Login: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = teclado.nextLine();

        if (!usernameDigitado.equals(usernameDB) || !senhaDigitada.equals(senhaDB)) {
            throw new LoginInvalidoException();
        }

        System.out.println("Login efetuado com sucesso!");
    }
}
