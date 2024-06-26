
package model.DAO;

import com.mysql.jdbc.Connection;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.UsuariosDTO;


public class LoginDAO {
    public List<UsuariosDTO> read() {
        List<UsuariosDTO> user = new ArrayList();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                UsuariosDTO usuario = new UsuariosDTO();
                usuario.setIdUsuarios(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setEmail(rs.getString("email"));
                //usuario.setCpf(rs.getString("cpf"));
               // usuario.setTelefone(rs.getString("telefone"));
                user.add(usuario);
            }
            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public void create(UsuariosDTO createLogin) {

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO usuario (nome, senha ,email ,cpf ,telefone) VALUES (?,?,?,?, ?)");
            stmt.setString(1, UsuariosDTO.getNome());
            stmt.setString(2, createLogin.getSenha());
            stmt.setString(3, createLogin.getEmail());
           // stmt.setString(4, createLogin.getCpf());
           // stmt.setString(5, createLogin.getTelefone());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Boolean login(String nome, String senha) {
        Boolean validar = false;
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM usuario WHERE nome = ? AND senha = ?");
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {
                validar = true;
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return validar;
    }
}