package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Aluno;
import util.ConexaoDB;

public class AlunoDao {
    
    private final Connection c;
    
    public AlunoDao() throws SQLException, ClassNotFoundException {
        c = new ConexaoDB().getConnection();
    }
    
    public void inserirAluno(Aluno aluno)throws SQLException, NullPointerException {
        String sql = "INSERT INTO ALUNO(NOME,SOBRENOME,CURSO,PERIODO,RA) VALUES (?,?,?,?,?)";
        
        try{
        
        PreparedStatement stmt = this.c.prepareStatement(sql);
        
        stmt.setString(1, aluno.getNome());
        stmt.setString(2, aluno.getSobrenome());
        stmt.setString(3, aluno.getCurso());
        stmt.setString(4, aluno.getPeriodo());
        stmt.setString(5, aluno.getRa());
        
        stmt.executeUpdate();
        System.out.print("\nAluno criado com sucesso\n");
        stmt.close();
        
        } catch (SQLException sqle) {
            System.err.print("\nErro SQLE\n" + sqle);
        } catch (NullPointerException npe) {
            System.err.print("\nErro NPE\n");
        }
    }
}
