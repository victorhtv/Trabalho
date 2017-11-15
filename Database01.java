
package database01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Database01 {

    public static Connection conexao;
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static String sql;

    public static void main(String[] args) throws SQLException {

        int id;
        String nome;
        String cpf;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o Id");
        id = Integer.parseInt(in.nextLine());

        System.out.println("Digite o Nome");
        nome = in.nextLine();

        System.out.println("Digite o Cpf");
        cpf = in.nextLine();

        String usuario = "system";
        String senha = "tiger";
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", usuario, senha);

        sql = "INSERT INTO contato (id, nome, cpf) VALUES (?, ?, ?)";
        ps = conexao.prepareStatement(sql);

        ps.setInt(1, id);
        ps.setString(2, nome);
        ps.setString(3, cpf);

        ps.execute();
        ps.close();
        conexao.close();

        System.out.println("\n\nListando os Registros Gravados");
        
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", usuario, senha);
        sql = "SELECT * FROM contato ORDER BY nome";
        ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println("Id..:" + rs.getInt("id"));
            System.out.println("Nome:" + rs.getString("nome"));
            System.out.println("Cpf.:" + rs.getString("cpf"));
            System.out.println("");
        }
    private Object stmt;
    private Object pstmt;
    private Object con;

	public void alterar(Interger id, nome, cpf c)throws Exception{
        OpenDatabase();
        String SQL = "update CADASTRO set nome=?, cpf=?" + " where id=?";
        pstmt = con.prepareStatement(SQL);
        pstmt.setInt(3, c.getId());
        pstmt.setString(1, c.getNome());
        pstmt.setInt(2, c.getCpf());
        pstmt.executeUpdate();// executa a atualização
    }
	
	public void delete(Integer id)throws Exception{ 
        OpenDatabase();
        String SQL = "DELETE from CADASTRO WHERE codigo="+id;
        stmt.executeUpdate(SQL);
        CloseDatabase();
    }

    private void OpenDatabase() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void CloseDatabase() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}