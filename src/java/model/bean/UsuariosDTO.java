package model.bean;

public class UsuariosDTO {
    private static int idUsuarios;
    private  String nome;
    private String senha;
    private String email;
    private String cpf;
    private String telefone;

    public UsuariosDTO() {
    }

    public static int getIdUsuarios() {
        return idUsuarios;
    }

    public static void setIdUsuarios(int idUsuarios) {
        UsuariosDTO.idUsuarios = idUsuarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public UsuariosDTO(String nome, String senha, String email, String cpf, String telefone) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
    }

}