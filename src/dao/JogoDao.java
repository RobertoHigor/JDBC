/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import model.Jogos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import controller.ConnectionFactory;

/**
 *
 * @author Higor
 */
public class JogoDao {
    private final Connection connection;    
    public JogoDao() {
        this.connection = new ConnectionFactory().getConnection();
        
    }    
    public void adiciona(Jogos jogo){    
    String sql = "insert into jogos " +

             "(nome,ano,nota)" +

             " values (?,?,?)";
     try {
         // prepared statement para inserção
         PreparedStatement stmt = connection.prepareStatement(sql);
         // seta os valores
         stmt.setString(1,jogo.getNome());
         stmt.setInt(2,jogo.getAno());
         stmt.setString(3,jogo.getNota());  
         // executa
         stmt.execute();
         stmt.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }    
}
}
