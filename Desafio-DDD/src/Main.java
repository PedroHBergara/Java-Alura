import br.com.alura.model.Musica;
import br.com.alura.model.Podcast;
import br.com.alura.model.MinhasPreferidas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i <1000 ; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("bolhaDev");
        meuPodcast.setHost("Marcos mendes");

        for (int i = 0; i < 100; i++) {
            meuPodcast.reproduz();

        }
        for (int i = 0; i < 50; i++) {
            meuPodcast.curte();

        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
        
    }
}