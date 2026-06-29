package banco.model;
public class Usuario {

    private int id;
    private String login;
    private String senha;
    private String nome;
    private String perfil;

    public Usuario() {

    }

    public Usuario(int id, String login, String nome, String perfil, String senha) {
        this.id = id;
        this.login = login;
        this.nome = nome;
        this.perfil = perfil;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}