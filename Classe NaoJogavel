public class NaoJogavel extends Personagem {
    private boolean aliado;

  public NaoJogavel(String nome, int vitalidade, Jogo jogo, boolean aliado) {
    super(nome, vitalidade, jogo);
    this.aliado = aliado;  
  }

  public boolean isAliado(){
    return aliado;
  }

  public void setAliado(boolean aliado){
    this.aliado = aliado;
  }

  @Override
  public void aplicarGolpeEspecial(Personagem adversario) {
    int dano;
    switch (getJogo().getDificuldade()) {
      case "Fácil":"
        dano = 20;
        break;
      case "Médio":
        dano = 30;
        break;
      case "Difícil":
        dano = 40;
        break;
      default:
        dano = 0;
    }
    adversario.setVitalidade(adversario.getVitalidade() - dano);
  }
}
