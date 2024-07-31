import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private String dificuldade;
    private List<Personagem> listaPersonagem;

  public Jogo {
    this.dificuldade = dificuldade;
    this.listaPersonagem = new ArrayList<>();
  }

  public String getDificulade() {
    return dificuldade;
  }

  public void setDificuldade(String dificuldade){
    this.dificuldade = dificuldade;
  }

  public List<Personagem> getListaPersonagem() {
    return listaPersonagem;
  }

  public void adicionarPersonagem(Personagem personagem) {
    listaPersonagem.add(personagem);
  }

  public void removerPersonagem(Personagem personagem) {
    listaPersonagem.remove(personagem);
  }
}
