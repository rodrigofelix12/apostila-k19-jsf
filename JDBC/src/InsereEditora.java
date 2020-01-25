import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsereEditora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("Abrindo conexão...");
			Connection conexao = FabricaDeConexao.CriaConexao();
			
			System.out.println("Digite o nome da editora");
			String nome = entrada.nextLine();
			
			System.out.println("Digite o e-mail da editora");
			String email = entrada.nextLine();
			
			String textoDoComando = "INSERT INTO Editora (nome, email) " + 
					"VALUES (?, ?)";
			
			PreparedStatement comando = conexao.prepareStatement(textoDoComando);
			comando.setString(1, nome);
			comando.setString(2, email);
			
			System.out.println("Executando comando...");
			comando.execute();
			
			System.out.println("Fechando conexão...");
			conexao.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
