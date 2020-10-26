package jogasa.simarro.actividad10;

public class Comida {
    private String nombre;
    private String descripcion;
    private float precio;
    private int categoria;
    public Comida(String nombre, String descripcion, float precio, int categoria){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio=precio;
        this.categoria=categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return nombre+descripcion+precio;
    }
}
