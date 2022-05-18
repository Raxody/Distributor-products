package domain;

public class VentasCliente {
    private String nombre;
    private double total;

    public VentasCliente(String nombre, double total) {
        this.nombre = nombre;
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTotal() {
        return total;
    }
}
