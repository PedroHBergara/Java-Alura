package br.com.alura.model;

public class Musica extends Audio{

    private String Artista;
    private String Album;
    private String genero;

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalReproducao() > 200 ){
            return 10;
        }else{
            return 7;
        }

    }
}
