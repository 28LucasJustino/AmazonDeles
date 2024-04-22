package model.DAO;

import java.sql.Connection;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.ProdutosDTO;


public class ProdutosDAO {
    
      public List<ProdutosDTO> read() {
        List<ProdutosDTO> objProdut = new ArrayList();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ProdutosDTO produtoDTO = new ProdutosDTO();
                produtoDTO.setIdProdutos(rs.getInt("idProdutos"));                       
                produtoDTO.setNome(rs.getString("nome")); 
                produtoDTO.setCategoria(rs.getString("categoria"));
                produtoDTO.setDescricao(rs.getString("descricao"));
                produtoDTO.setPreco(rs.getInt("preco"));
                produtoDTO.setEstoque(rs.getInt("estoque"));
                
                objProdut.add(produtoDTO);
            }
            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return objProdut;
    }
public void create(ProdutosDTO createLivro) {

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO produtos (nome,categoria,discricao,preco,estoque) VALUES (?,?,?,?,?)");
            stmt.setString(1,createLivro.getNome());
            stmt.setString(2,createLivro.getCategoria());
            stmt.setString(3,createLivro.getDescricao());
            stmt.setFloat(4,createLivro.getPreco());
            stmt.setInt(5,createLivro.getEstoque());
        
                       
            
            stmt.executeUpdate();

            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

public void drop(ProdutosDTO dropProduto){
       try {
          Connection conexao = Conexao.conectar();
          PreparedStatement stmt = null;
          
          stmt = conexao.prepareStatement("DELETE FROM produto WHERE idProduto = ?");
          stmt.setInt(1,dropProduto.getIdProdutos());
          
          
          stmt.executeUpdate();
          
          stmt.close();
          conexao.close();
          
       } catch (SQLException e){
            e.printStackTrace();
    }
    }  
 public void edit(ProdutosDTO editLivro){
        try {
          Connection conexao = Conexao.conectar();
          PreparedStatement stmt = null;
          stmt = conexao.prepareStatement("UPDATE produto SET nome =?,categoria =?,descricao =?,preco =?,estoque =?  WHERE idProduto = ?");
          stmt.setString(1,editLivro.getNome());
          stmt.setString(2,editLivro.getCategoria());
          stmt.setString(3,editLivro.getDescricao());
          stmt.setFloat(4,editLivro.getPreco());
          stmt.setInt(5,editLivro.getEstoque());
  
          
          stmt.executeUpdate();
          
          stmt.close();
          conexao.close();
          
       } catch (SQLException e){
            e.printStackTrace();
    }
    }
}