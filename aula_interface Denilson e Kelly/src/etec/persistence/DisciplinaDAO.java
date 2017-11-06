package etec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import etec.model.Disciplina;

public class DisciplinaDAO implements IDAO{

	private Connection conn;

	public DisciplinaDAO(Connection conn) {
		this.conn = conn;
	}
	
	
	@Override
	public void inserir(Object o) throws Exception {
		String sql = "insert into disciplina (nome) values ('"+((Disciplina)o).getNome()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.execute();
	}


	public void salvar(Disciplina dPCII) {
		
	}
	
}