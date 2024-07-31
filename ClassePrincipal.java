public class Principal{
  public static void main(String[] args){
   Jogo jogo = new Jogo("Medio");

    Jogavel jogavel = new Jogavel("Heroina", 100, jogo, 3);
    NaoJogavel naoJogavel = new NaoJogavel("adversario", 100, jogo, false);

    jogo.adcionarPersonagem(jogavel);
    jogo.adcionarPersonagem(naoJogavel);

    jogavel.botaoA(naoJogavel);
    jogavel.botaoB(naoJogavel);

    System.out.println("Vitalidade do personagem não jogavel: " + naoJogavel.getVitalidade());
  }
}
