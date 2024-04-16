package model.bean;

public class UsuariosDTO {
    private static int idUsuarios;
    private  String nome;
    private String senha;
    private String email;
    private int cpf;
    private int telefone;

    public UsuariosDTO() {
    }

    public UsuariosDTO(String nome, String senha, String email, int cpf, int telefone) {
        this.nome = nome;
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
}