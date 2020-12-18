import java.util.Date;

public class Exposiciones {
    private String titulo;
    private String descripcion;
    private Date fechaInauguracion;
    private Date fechaClausura;

    public Exposiciones(String titulo, String descripcion, Date fechaInauguracion, Date fechaClausura) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInauguracion = fechaInauguracion;
        this.fechaClausura = fechaClausura;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInauguracion() {
        return fechaInauguracion;
    }

    public void setFechaInauguracion(Date fechaInauguracion) {
        this.fechaInauguracion = fechaInauguracion;
    }

    public Date getFechaClausura() {
        return fechaClausura;
    }

    public void setFechaClausura(Date fechaClausura) {
        this.fechaClausura = fechaClausura;
    }

    @Override
    public String toString() {
        return "Exposiciones{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaInauguracion=" + fechaInauguracion +
                ", fechaClausura=" + fechaClausura +
                '}';
    }
}
