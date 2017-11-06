package etec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import etec.model.Pessoa;

public class PessoaDAO {
	
	Connection conn;
	
	public PessoaDAO(Connection conn) {
		this.conn = conn;
	}
	
	public void insert(Pessoa p) throws SQLException {
		String sql = "insert into pessoa (nome) values ('"+p.getNome()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.execute();
	}
	
	
}
