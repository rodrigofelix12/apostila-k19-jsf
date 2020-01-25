import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsereLivro {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("Abrindo conexão...");
			Connection conexao = FabricaDeConexao.CriaConexao();
			
			System.out.println("Digite o titulo do livro: ");
			String titulo = entrada.nextLine();
			
			System.out.println("Digite o preço do livro: ");
			double preco = entrada.nextDouble();
			
			System.out.println("Digite o código da editora: ");
			int editoraId = entrada.nextInt();
			
			String textoDoComando = "INSERT INTO Livro (titulo, preco, editora_id) " + 
					"VALUES (?, ?, ?)";
			
			PreparedStatement comando = conexao.prepareStatement(textoDoComando);
			comando.setString(1, titulo);
			comando.setDouble(2, preco);
			comando.setInt(3, editoraId);
			
			System.out.println("Executando comando...");
			comando.execute();
			
			System.out.println("Fechando conexão...");
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
