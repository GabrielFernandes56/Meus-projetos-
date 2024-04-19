package SistemaLogin;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String username = "Gabriel";
		String password = "Teste";
		
		System.out.print("Informe o nome de usuario: ");
		String inputUsername = entrada.nextLine();
		
		System.out.print("Informe a senha: ");
		String inputPassword = entrada.nextLine();
		
		if(inputUsername.equals(username) && inputPassword.equals(password)) {
			System.out.println("Login bem sucedido.");
			System.out.println("Bem vindo!!");
		}else {
			System.out.println("Nome de usuario ou senha incorreto.");
		}
		entrada.close();
	}

}
