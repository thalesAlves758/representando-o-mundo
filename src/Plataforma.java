import java.util.List;

public class Plataforma {
  private String nome;
  private String link;
  private List<Aluno> alunos;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getLink() {
    return this.link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public List<Aluno> getAlunos() {
    return this.alunos;
  }

  public void setAlunos(List<Aluno> alunos) {
    this.alunos.addAll(alunos);
  }

  public void addAluno(Aluno aluno) {
    this.alunos.add(aluno);
  }
}