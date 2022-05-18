package domain;

public class Articulo {
    private int cantidad;
    private String nombre;
    private double precio;

    public Articulo( int cantidad, String nombre, double precio) {

        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
    }



    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
