package chatTCP;

import java.io.PrintStream;
import java.net.Socket;

public class Cliente {
		
	public static void main(String[] args) {
		
		try {
			//Declarar o socket cliente
			Socket cliente = new Socket("127.0.0.1", 7000);
		
			System.out.println("Cliente iniciado");
			
			// Fluxo de dados para envio
			PrintStream ps = new PrintStream(cliente.getOutputStream());
			
			ps.println("Ola Mundo!");
			
			cliente.close();
			System.out.println("Cliente finalizado");

		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a conexao");
		}
		
		
		
	}
		
}
