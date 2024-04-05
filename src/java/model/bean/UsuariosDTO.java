package model.bean;

public class UsuariosDTO {
    private static int idUsuarios;
    private static String nome;
    private String senha;
    private String email;
    private char cpf;
    private char telefone;

    public UsuariosDTO() {
    }

    public UsuariosDTO(String senha, String email, char cpf, char telefone) {
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public static int getIdUsuarios() {
        return idUsuarios;
    }

    public static void setIdUsuarios(int idUsuarios) {
        UsuariosDTO.idUsuarios = idUsuarios;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        UsuariosDTO.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getCpf() {
        return cpf;
    }

    public void setCpf(char cpf) {
        this.cpf = cpf;
    }

    public char getTelefone() {
        return telefone;
    }

    public void setTelefone(char telefone) {
        this.telefone = telefone;
    }

   
}