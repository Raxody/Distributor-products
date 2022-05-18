package domain;

public class Pedido {
    private int id;
    private double subtotal;
    private double total;
    private int identificacionRutaDistribucion;
    private int identificacionPersonaCliente;

    public Pedido(int id, double subtotal, double total, int identificacionRutaDistribucion, int identificacionPersonaCliente) {
        this.id = id;
        this.subtotal = subtotal;
        this.total = total;
        this.identificacionRutaDistribucion = identificacionRutaDistribucion;
        this.identificacionPersonaCliente = identificacionPersonaCliente;
    }

    public Pedido(double subtotal, int identificacionRutaDistribucion, int identificacionPersonaCliente) {
        this.subtotal = subtotal;
        this.identificacionRutaDistribucion = identificacionRutaDistribucion;
        this.identificacionPersonaCliente = identificacionPersonaCliente;
    }

    public Pedido() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getIdentificacionRutaDistribucion() {
        return identificacionRutaDistribucion;
    }

    public void setIdentificacionRutaDistribucion(int identificacionRutaDistribucion) {
        this.identificacionRutaDistribucion = identificacionRutaDistribucion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdentificacionPersonaCliente() {
        return identificacionPersonaCliente;
    }

    public void setIdentificacionPersonaCliente(int identificacionPersonaCliente) {
        this.identificacionPersonaCliente = identificacionPersonaCliente;
    }
}
