
package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
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
                usuario.setCpf(rs.getInt("cpf"));
                usuario.setTelefone(rs.getInt("telefone"));
                user.add(usuario);
            }
            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"LoginDAO READ:" + e);
        }

        return user;
    }

    public void create(UsuariosDTO createLogin) {

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO usuario (nome, senha ,email ,cpf ,telefone) VALUES (?,?,?,?, ?)");
            stmt.setString(1, createLogin.getNome());
            stmt.setString(2, createLogin.getSenha());
            stmt.setString(3, createLogin.getEmail());
            stmt.setInt(4, createLogin.getCpf());
            stmt.setInt(5, createLogin.getTelefone());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"LoginDAO CREATE:" + e);
        }

    }

    public Boolean login(String email, String senha) {
        Boolean validar = false;
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM usuario WHERE email = ? AND senha = ?");
            stmt.setString(1, email);
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
            JOptionPane.showMessageDialog(null,"LoginDAO BOOLEAN:" + e);
        }
        return validar;
    }
}