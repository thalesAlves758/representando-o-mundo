public class Aluno {
  private String nome;
  private String nomeUsuario;
  private String senha;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNomeUsuario() {
    return this.nomeUsuario;
  }

  public void setNomeUsuario(String nomeUsuario) {
    this.nomeUsuario = nomeUsuario;
  }

  public String getSenha() {
    return "criptografada";
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public boolean compararSenha(String senha) {
    return this.senha.equals(senha);
  }
}
