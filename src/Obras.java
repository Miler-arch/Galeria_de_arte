public class Obras {
    private int numeroRegistro;
    private String titulo;
    private String artista;
    private String estilo;
    private int precioSalida;

    public Obras(int numeroRegistro, String titulo, String artista, String estilo, int precioSalida) {
        this.numeroRegistro = numeroRegistro;
        this.titulo = titulo;
        this.artista = artista;
        this.estilo = estilo;
        this.precioSalida = precioSalida;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getPrecioSalida() {
        return precioSalida;
    }

    public void setPrecioSalida(int precioSalida) {
        this.precioSalida = precioSalida;
    }

    @Override
    public String toString() {
        return "Obras{" +
                "numeroRegistro=" + numeroRegistro +
                ", titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", estilo='" + estilo + '\'' +
                ", precioSalida=" + precioSalida +
                '}';
    }
}
