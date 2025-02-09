public abstract class Personagem {
  private String nome;
  private int vitalidade;
  private Jogo jogo;

public Personagem(String nome, int vitalidade, Jogo jogo) {
    this.nome = nome;
    setVitalidade(vitalidade);
    this Jogo = jogo;
}

public String getNome(){
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getVitalidade() {
    return vitalidade;
}

public void setVitalidade(int vitalidade) {
    if(vitalidade >= 0 && vitalidade <= 100) {
      this.vitalidade = vitalidade;
    }else {
          System.out.println("A Vitalidae deve estar entre 0 e 100");
      }
}

public Jogo getJogo() {
    return jogo;
}

public void setJogo(Jogo jogo){
    this.jogo = jogo;
}

public abstract void aplicarGolpeEspecial(Personagem adversario);
}
