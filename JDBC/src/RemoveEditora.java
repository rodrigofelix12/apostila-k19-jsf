import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class RemoveEditora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("Abrindo conexão...");
			Connection conexao = FabricaDeConexao.CriaConexao();
			
			System.out.println("Digite o id da editora que será excluida...");
			int idEditora = entrada.nextInt();
			
			
			String textoDoComando = "DELETE FROM Editora WHERE id = (?)";
			
			PreparedStatement comando = conexao.prepareStatement(textoDoComando);
			
			comando.setInt(1, idEditora);
			
			System.out.println("Executando comando...");
			comando.execute();
			
			System.out.println("Fechando conexão...");
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
