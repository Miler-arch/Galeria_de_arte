public class Propietarios {
    private String propietario;
    private int precio;

    public Propietarios(String propietario, int precio) {
        this.propietario = propietario;
        this.precio = precio;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Propietarios{" +
                "propietario='" + propietario + '\'' +
                ", precio=" + precio +
                '}';
    }
}
