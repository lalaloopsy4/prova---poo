public class Jogavel extends Personagem implements Controle{
    private int nivel;

  public Jogavel(String nome, int vitalidae, Jogo jogo, int nivel) {
      super(nome, vitalidae, jogo);
      setNivel(nivel);
  }

  public int getNivel() {
      return nivel;
  }
  public void setNivel(int nivel) {
      if(nivel >= 1 && nivel <= 5){
      this.nivel = nivel;
      } else {
          System.out.println("Nível inválido");
      }
  }
  @Override
  public void aplicarGolpeEspecial(Personagem adversario) {
    adversario.setVitalidade(adversário.getVitalidade() - 10 * nivel);
  }
  @Override
  public void botaoA(Personagem personagem){
    aplicarGolpeNormal(personagem);
  }
  @Override
  public void botaoB(Personagem personagem){
    aplicarGolpeEspecial(personagem);
  }
}
