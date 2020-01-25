import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AlteraEditora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("Abrindo conexão...");
			Connection conexao = FabricaDeConexao.CriaConexao();
			
			System.out.println("Informe o novo nome da editora...");
			String nome = entrada.nextLine();
			
			System.out.println("Informe o ID da Editora...");
			int idEditora = entrada.nextInt();
			
			String textoDoComando = "UPDATE Editora SET nome = (?) WHERE id = (?)";
			
			PreparedStatement comando = conexao.prepareStatement(textoDoComando);
			
			comando.setString(1, nome);
			comando.setInt(2, idEditora);
			
			System.out.println("Executando comando...");
			comando.execute();
			
			System.out.println("Fechando conexão...");
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
