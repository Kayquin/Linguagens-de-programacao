import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Rodriguinho"));
        jogadores.add(new Jogador("Alane Dias"));
        jogadores.add(new Jogador("Beatriz Reis"));
        jogadores.add(new Jogador("Davi Brito"));
        jogadores.add(new Jogador("Deniziane Ferreira"));
        jogadores.add(new Jogador("Fernanda Bande"));
        jogadores.add(new Jogador("Giovanna Lima"));
        jogadores.add(new Jogador("Giovanna Pitel"));
        jogadores.add(new Jogador("sabelle Nogueira"));
        jogadores.add(new Jogador("Juninho"));
        jogadores.add(new Jogador("Leidy Elin"));
        jogadores.add(new Jogador("Lucas Henrique"));
        jogadores.add(new Jogador("Lucas Luigi"));
        jogadores.add(new Jogador("Lucas Pizane"));
        jogadores.add(new Jogador("Marcus Vinicius"));
        jogadores.add(new Jogador("Maycon Cosmer"));
        jogadores.add(new Jogador("Marcus Vinicius"));
        jogadores.add(new Jogador("MC Bin Laden"));
        jogadores.add(new Jogador("Michel Nogueira"));
        jogadores.add(new Jogador("Nizam"));
        jogadores.add(new Jogador("Raquele Cardozo"));
        jogadores.add(new Jogador("MarcusVinicius"));
        jogadores.add(new Jogador("Rodriguinho"));
        jogadores.add(new Jogador("Thalyta Alves"));
        jogadores.add(new Jogador("Vanessa Lopes"));
        jogadores.add(new Jogador("Vinicius Rodrigues"));
        jogadores.add(new Jogador("Wanessa Camargo"));
        jogadores.add(new Jogador("Yasmin Brunet"));

        int maxVotos = 0;
        Jogador eliminado = null;

        while (true) {
            String votoEm = JOptionPane.showInputDialog("Em quem você vota para sair da casa?");
            if (votoEm == null || votoEm.equalsIgnoreCase("sair")) {
                break;
            }

            for (Jogador jugador : jogadores) {
                if (jugador.getNome().equalsIgnoreCase(votoEm)) {
                    jugador.incrementaUmVoto();
                    if (jugador.getVotos() > maxVotos) {
                        maxVotos = jugador.getVotos();
                        eliminado = jugador;
                    }
                    break;
                }
            }
        }

        if (eliminado!= null) {
            JOptionPane.showMessageDialog(null, "Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami,\nse eu conseguir domar o sol,\nse eu conseguir fazer o mar virar sertão, e o sertão virar mar,\nse eu conseguir dizer o que eu nunca vou conseguir dizer,\naí terá chegado o dia em que eu vou conseguir te eliminar com alegria.\nCom " + maxVotos + " votos, é você quem sai " + eliminado.getNome());
        }
    }
}

